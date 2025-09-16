package apuntes

fun main() {
    val a: Int = 7
    val b: Int = 2

    println("($a + $b) = ${a + b}")
    println("($a - $b) = ${a - b}")
    println("($a * $b) = ${a * b}")
    println("($a / $b) = ${a / b}")
    println("($a % $b) = ${a % b}")

    val imput = 5
    var result = true
    val greatherThanZero = imput > 0
    val isEven = imput % 2 == 0

    result = greatherThanZero && isEven
    println("Es mayor que cero y par: $result")

    result = greatherThanZero || isEven
    println("Es mayor que cero o par: $result")

    result = greatherThanZero && !isEven
    println("Es mayor que cero e impar: $result")


}