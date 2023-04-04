package OpenColsed

class Regular:Employee {
    var basicSalary:Float? = null

    override fun calcHourBonus(hours: Int): Float {
        return (basicSalary!!/30) * hours
    }
}