fun main() {
    val string = readLine()!!

    // Use .length to get length of string
    val n = string.length


    println("$n repetitions of the word ${string}: ${string.repeat(n)}")
}