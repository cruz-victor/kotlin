package solid.srp

open class Figure() {
    open fun calculateArea(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Figure() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val width: Double, val height: Double) : Figure() {
    override fun calculateArea(): Double {
        return width * height
    }
}

fun main() {
    val figures = listOf(Figure(), Circle(5.00), Square(2.00, 4.00))
    for (figure in figures) {
        println("El area es: ${figure.calculateArea()}")
    }
}