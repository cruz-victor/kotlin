package datastructure

fun main(){
    //Los predicados son funciones o expresiones que siempre devuelven un valor booleano (true/false)
    val ages= listOf(12,22,17,30,29,15)
    val adultAges=ages.filter { it>=18 }
    println(adultAges)

    val kidAges=ages.filterNot { it>=18 }
    println(kidAges)
}