package InterfaceSegregation

class CashOrder:CashOrderInterface {
    override fun processCashInvoice(): String {
        return "Cash Payment"
    }
}