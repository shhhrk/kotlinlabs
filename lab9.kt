import kotlin.math.*
fun circleArea(r:Int):Double{
   val x=r.toDouble()
    return x.pow(2.0)*PI
}
fun main() {
    println(circleArea(2))
}
