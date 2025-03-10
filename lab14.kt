data class Employee(val name: String, var salary: Int)
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Melanie","Max","Eugune","Martey","Clint")
    fun generateEmployee(): Employee {
        val name = names.random()
        val salary = Random.nextInt(minSalary, maxSalary + 1)
        return Employee(name, salary)
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
