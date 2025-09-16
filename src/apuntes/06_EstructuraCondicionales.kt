package apuntes

fun main() {
    println("Introduce la fecha dd/mm/aaaa")
    val fecha = readln()

    val partes = fecha.split("/")
    val dia = partes[0].toInt()
    val mes = partes[1].toInt()
    val year = partes[2].toInt()

    println("$dia, $mes, $year")
}