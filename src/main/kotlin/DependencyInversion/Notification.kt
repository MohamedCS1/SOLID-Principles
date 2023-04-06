package DependencyInversion

class Notification(val messagingServices: messagingServices) {

    fun sendMail(): String {
        return messagingServices.send()
    }
}