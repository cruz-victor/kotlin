package datastructure

fun main(){
    val superMarketProducts= listOf("Milk","Eggs","Juice","Meat","Rice")
    val breakFast=superMarketProducts
        .take(3)
        .filterNot { it=="Eggs" }
    println(breakFast)

    val dinner= superMarketProducts
        .drop(3)
    println(dinner)
}