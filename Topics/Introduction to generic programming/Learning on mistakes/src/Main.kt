data class Container<T>(val value: T)

fun main() {
    val container = Container("Good job!")
    println(container.value)

}