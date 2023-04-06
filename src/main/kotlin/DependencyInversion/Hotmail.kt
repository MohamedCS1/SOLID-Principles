package DependencyInversion

class Hotmail:messagingServices {
    override fun send(): String {
        return "send it by hotmail"
    }
}