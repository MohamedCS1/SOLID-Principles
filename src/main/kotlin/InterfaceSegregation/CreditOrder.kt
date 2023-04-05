package InterfaceSegregation

class CreditOrder:CreditOrderInterface {
    override fun processCreditInvoice(): String {
        return "Credit Invoice"
    }
}