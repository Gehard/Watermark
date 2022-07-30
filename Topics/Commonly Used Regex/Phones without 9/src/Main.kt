fun main() {
    val text = readln()
    val regex = Regex("""\(?[\d]{3}\)?-?[\d^9]{3}-?[\d^9]{4}""")
    val phones = regex.findAll(text)

    for (phone in phones) println(phone.value)

}