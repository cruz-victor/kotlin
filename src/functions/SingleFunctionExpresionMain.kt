package functions

fun main(){
    val greeting = getWelcomeText()
    println(greeting)
    println(cleanText(greeting))
    println(addStarsFormat(greeting))
    val result1=multiply(2,2)
    val result2=multiply(1,2,3)
    val result3=multiply(1,2,3, 10)
    println(result1)
    println(result2)
    println(result3)
}

fun getWelcomeText():String = "*** Welcome to La Paz city ***"

fun cleanText(text:String):String = text
    .removePrefix("***")
    .removeSuffix("***")
    .trim()

fun addStarsFormat(text: String): String = addStarsFormat(text, 10)

fun multiply(number1:Int, number2:Int):Int=number1*number2
fun multiply(number1: Int, number2: Int, number3: Int):Int=number1*number2*number3
fun multiply(number1: Int, number2: Int, number3: Int, constant:Int):Int=(number1*number2*number3)+constant