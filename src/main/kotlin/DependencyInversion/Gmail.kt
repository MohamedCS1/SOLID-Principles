package DependencyInversion

class Gmail:messagingServices {

    override fun send(): String {
        return "send it by gmail"
    }
}