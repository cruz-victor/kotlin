package functions

fun main(){
    val greating={"Hola Vix"}
    println(greating())

    val greatingWithName={text:String-> println(text)}
    greatingWithName("Hola Vix Crux Gomex")

    val add={x:Int->x+10}
    println(add(5))
}