fun main() {
    val value = readln().toDouble()
    val doubleString = String.format("%,.2f", value)
    println(doubleString)
}