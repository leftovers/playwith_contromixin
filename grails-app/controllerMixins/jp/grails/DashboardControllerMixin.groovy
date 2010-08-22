package jp.grails

class DashboardControllerMixin {
    def exampleMixinAction = {
        render(text:"exampleMixinAction called !?")
    }
}
