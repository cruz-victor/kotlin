package datatype

import java.nio.DoubleBuffer

fun main() {
    println("Hi datatype")

//    Integer numbers
    val age = 40

    var age2 = 50
    age2 = age2 + 1

    val newAge: Byte = 127

    val productId = 2121221

    val id: Long = 9_454_454


    println(age)
    println(age2)
    println(id)

//    Float numbers (Float y Double)
    val myFloat: Float = 25.45454545454f
    val myDouble: Double = 30.4545454545454545454
    println(myFloat)
    println(myDouble)

    val myFloat2 = 25.44545454545454f
    val myDouble2 = 30.454545454545454545454
    println(myFloat2)
    println(myDouble2)

//    Boolean datatype
    val isLogged:Boolean=true
    val hasAddress:Boolean=false
    println(isLogged)
    println(hasAddress)

    val isLogged2=true
    val hasAddress2=false
    println(isLogged2)
    println(hasAddress2)

//    Boolean operations
    println("Boolean operations")
    println(isLogged && hasAddress)
    println(isLogged.and(hasAddress))
    println(isLogged and hasAddress)
    println(isLogged or hasAddress)
    println(!isLogged)
    println(isLogged.not())

//    Char variables
    val keyInserted='a'
    println(keyInserted)

    val keyInserted2='b'
    println(keyInserted2)
}