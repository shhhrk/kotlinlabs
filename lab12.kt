class Employee (_name: String, _salary: Int){
    var name: String = _name
    var salary: Int = _salary
}
fun main() {
    val emp = Employee("Mary", 20)
    println(emp.salary)
    println(emp.name)
    emp.salary += 10
    println(emp.salary)
}
