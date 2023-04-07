package SingleResponsibility

fun main() {

}

// bad class because the notification not in the responsibility of this class
class MailService{

    fun sendMail():String
    {
        return "send mail"
    }

    fun schedulerMail(): String
    {
        return "send mail in 19/12/2090"
    }

    fun pushNotification(): String
    {
        return "push notification"
    }
}

// good class with single responsibility and one reason to change
class GoodMailService{

    fun sendMail():String
    {
        return "send mail"
    }

    fun schedulerMail(): String
    {
        return "send mail in 19/12/2090"
    }

    /* also must be respected the principle in functions
       for example if I need send notification just use instance from notifications class not write the logic of push notification in this function */
    fun sendMailAndNotifyUser()
    {
        sendMail()
        Notifications().pushNotification()
    }
}

class Notifications{
    fun pushNotification(): String
    {
        return "push notification"
    }
}
