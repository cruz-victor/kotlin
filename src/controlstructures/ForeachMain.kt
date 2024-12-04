package controlstructures

import kotlin.system.measureNanoTime

fun main() {

    val forInRange = measureNanoTime {
        for (i in 0..1000) {
            println(i)
        }
    }

    val forEachRange = measureNanoTime {
        (0..1000).forEach {
            println(it)
        }
    }

    val numberList = (0..1000).toList()

    val forNumberList = measureNanoTime {
        for (number in numberList){
            println(number)
        }
    }

    val numberListforEach= measureNanoTime {
        numberList.forEach{println(it)}
    }

    println("El tiempo para forInRange es: $forInRange")
    println("El tiempo para forEachRange es: $forEachRange")
    println("El tiempo para forNumberList es: $forNumberList")
    println("El tiempo para forNumberListforEach es: $numberListforEach")
}