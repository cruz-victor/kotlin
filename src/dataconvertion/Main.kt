package dataconvertion

fun main() {
    val productLowStock:Byte=20
    val productStock:Int=productLowStock.toInt()
    println(productStock)
    println("El numero en Int es: $productStock")

//    Exercise
    println("Introduce tu edad")
    val old= readLine()
    println("Tiene $old años")
}