fun main() {
    val input = readln()
    var pas = ""

    val url: List<String> = input.substringAfter('?').split("&")

    for (i in url){
        if (i.contains("pass=")){
            pas=i.substringAfterLast("=")
        }
    }
    for (i in url) {
        if (i[i.length - 1] == '=') {
            println(i.substringBefore('=') + " : not found")
        } else {
            println(i.substringBefore('=') + " : " + i.substringAfter('='))
        }
    }
    for (i in 0 until url.size) {
        if (url[i].contains("pass")) {
            println("password : $pas")
        }
    }

}