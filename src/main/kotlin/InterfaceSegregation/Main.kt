package InterfaceSegregation

fun main() {
    val cashOrder = CashOrder()
    println(cashOrder.processCashInvoice())

    val creditOrder = CreditOrder()
    println(creditOrder.processCreditInvoice())

    val onlineOrder = OnlineOrder()
    println(onlineOrder.processOnlinePayment())
}


// Bad and fat interface
interface Order{
    fun processCashInvoice()

    fun processOnlinePayment()

    fun processCreditInvoice()
}

// Segregate interface to small interfaces every interface with single responsibility
interface CashOrderInterface
{
    fun processCashInvoice():String
}

interface OnlineOrderInterface
{
    fun processOnlinePayment():String
}

interface CreditOrderInterface
{
    fun processCreditInvoice():String
}