package jp.grails

import com.burtbeckwith.grails.plugins.dynamiccontroller.DynamicControllerManager
import org.springframework.beans.BeanWrapper
import org.springframework.beans.PropertyAccessorFactory

class DashboardController {
    static String infomation='infomation property from DashboardController'
    //part of the code borrowed from appinfo plugin
    def index = {
        Map map = [:]
        grailsApplication.controllerClasses.each{controller->
            List actions = []
            BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(controller.newInstance())
            for (pd in beanWrapper.propertyDescriptors) {
                String closureClassName = controller.getPropertyOrStaticPropertyOrFieldValue(pd.name, Closure)?.class?.name
                if (closureClassName) { actions << pd.name }
            }
            actions.addAll DynamicControllerManager.getDynamicActions(controller.clazz.name)
            actions.sort()
            map[controller.getLogicalPropertyName()]=actions
        }
        [map:map]
    }

    def overridethis = {
        render(text:"override me")
    }

    def getmixinstring = {
        try {
            render(text:"$mixinInfo")
        }
        catch(MissingPropertyException e) {
            render(text:"can't access mixin properties")
        }
    }
}
