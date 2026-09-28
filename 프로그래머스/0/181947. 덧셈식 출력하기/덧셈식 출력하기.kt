fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    val total = a + b
    println("$a + $b = $total")
}