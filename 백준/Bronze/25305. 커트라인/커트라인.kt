import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()

    var list = mutableListOf<Int>()
    for (i in 0 until n) {
        val num = sc.nextInt()
        list.add(num)
    }
    var reversedList = list.sortedDescending()
    println(reversedList.get(k - 1))
}