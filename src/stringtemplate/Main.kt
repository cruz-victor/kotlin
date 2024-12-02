package stringtemplate

fun main() {
    val price = 15.25
    val tax = 0.2
    val out = "La cantidad $price despues de impuesto es: $${price * (1 * tax)} "
    println(out)

    val total = price.times(tax.plus(other = 1))
    println(total.toFloat())
}