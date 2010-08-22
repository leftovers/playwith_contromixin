package jp.grails

class DashboardControllerMixin {
    static String infomation='Override infomation property'
    def exampleMixinAction = {
        render(text:"exampleMixinAction called !? ${infomation}")
    }
    def overridethis = {
        render(text:"override :DashboardControllerMixin")
    }
}
