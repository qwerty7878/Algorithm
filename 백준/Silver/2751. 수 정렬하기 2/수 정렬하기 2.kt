import java.util.TreeSet

fun main() {
    val n = readLine()!!.toInt()
    val sb = StringBuilder()
    val set = TreeSet<Int>()

    for (i in 0 until n) {
        set.add(readLine()!!.toInt())
    }

    for (num in set) {
        sb.append(num).append("\n")
    }
    println(sb.toString())
}