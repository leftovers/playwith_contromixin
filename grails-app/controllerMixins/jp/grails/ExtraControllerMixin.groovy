package jp.grails

class ExtraControllerMixin {
    def extra = {
        render(text:"extra called !?")
    }
}
