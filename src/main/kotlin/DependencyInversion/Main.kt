package DependencyInversion

fun main() {

    var notification = Notification(Gmail())
    println(notification.sendMail())

    notification = Notification(Hotmail())
    println(notification.sendMail())
}