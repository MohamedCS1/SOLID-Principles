package OpenColsed

class Manager:Employee {
    var basicSalary:Float? = null

    override fun calcHourBonus(hours: Int): Float {
        return ((basicSalary!!/30) * hours) * 2
    }

}