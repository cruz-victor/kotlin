package array

fun main() {
    println("ARRAYS")
    val myArray = arrayOf(1, "Victor", "Cruz", 40, true)
    println("Tus datos son: ")
    println("Eres el numero ${myArray[0]} de la lista")
    println("Tu nombre es ${myArray[1]}")
    println("Tu apellido es ${myArray[2]}")
    println("Tu edad es ${myArray[3]}")
    println("Eres realmente ${myArray[4]}")

    println("ARRAY VACIO")
    val emptyArray = emptyArray<Int>()
    println(emptyArray)

    println("TIPOS DE ARRAYS")
    val arrayBoolean = booleanArrayOf(true, false, true, false, false)
    arrayBoolean.forEach { println(it) }
    val arrayInteger = intArrayOf(1,2,3,4,5,6,7,8,9)
    arrayInteger.forEach { println(it) }
    val arrayFloat = floatArrayOf(1.1f,2.2f,3.3f)
    arrayFloat.forEach { println(it) }

    println("ARRAYS CON TAMAÑO")
    val arrayEmptyInt=IntArray(10)
    val arrayEmptyFloat=FloatArray(20)
    val arrayEmptyDouble=DoubleArray(40)
    println(arrayEmptyInt.size)
    println(arrayEmptyFloat.size)
    println(arrayEmptyDouble.size)

    println("EJERCICIO")
    val greetings= arrayOf("Hola","Hi", "Bienvenido","Buenos dias","Hallo")
    val introductions= arrayOf("mi nombre es","puedes llamarme","usualmente me llaman","yo soy")
    val names= arrayOf("Victor","Grace","Elon","Cuchi")

    val randomIndexGreeting=(Math.random()*greetings.size).toInt()
    val randomIndexIntroducction=(Math.random()*introductions.size).toInt()
    val randomIndexNames=(Math.random()*names.size).toInt()

    val phase="${greetings[randomIndexGreeting]} ${introductions[randomIndexIntroducction]} ${names[randomIndexNames]}"
    println(phase)
}