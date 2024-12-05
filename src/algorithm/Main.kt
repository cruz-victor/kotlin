package algorithm

fun main() {
    println("---Solucion v1---")
    val numbers = intArrayOf(0, 0, 1, 1, 2, 2, 3, 3, 4)
//    val numbers = intArrayOf(0)
//    val numbers = intArrayOf()
    println(numbers.distinct())

    println("---Solucion v2---")
    if (numbers.size > 1) {
        var currentIndex = 1
        for (index in 1 until numbers.size) {
            var previusIndex = index - 1
            if (numbers[previusIndex] != numbers[index]) {
                numbers[currentIndex] = numbers[index]
                currentIndex++
            }
        }

        for (index in currentIndex until numbers.size) {
            numbers[index] = 0
        }
    }
    println("--Array con datos distintos---")
    println(numbers.toList())
}