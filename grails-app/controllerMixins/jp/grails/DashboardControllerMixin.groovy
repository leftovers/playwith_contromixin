package jp.grails

class DashboardControllerMixin {
    def exampleMixinAction = {
        render(text:"exampleMixinAction called !? ${infomation}")
    }
    def overridethis = {
        render(text:"over ride :DashboardControllerMixin")
    }
}
