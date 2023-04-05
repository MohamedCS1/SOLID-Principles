package InterfaceSegregation

class OnlineOrder:OnlineOrderInterface {
    override fun processOnlinePayment(): String {
        return "Online Payment"
    }
}