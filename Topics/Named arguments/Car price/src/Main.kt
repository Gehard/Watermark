fun carPrice(old: Int = 5, kilometers:Int = 100_000 , maximumSpeed: Int = 120,
             automatic: Boolean = false):Int {
    var price = 8000
    if (old != 5) price -= (old - 5) * 2000
    if (kilometers != 100_000) price += ((100_000 - kilometers) / 10_000) * 200
    if (maximumSpeed != 120) price -= (120 - maximumSpeed) * 100
    if (automatic) price += 1500
    //println("$price on the second-hand market" )
    println(price)
    return price

}