package OpenColsed

fun main() {
    val manager = Manager()
    manager.basicSalary = 1500F

    val regular = Regular()
    regular.basicSalary = 1500F

    println(manager.calcHourBonus(10))

    println(regular.calcHourBonus(10))
}