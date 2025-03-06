import kotlin.random.Random

data class Employee(val name: String, var salary: Int)
class RandomEmployeeGenerator(_name: String, _minsalary: Int, _maxsalary: Int)
// Write your code here

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
