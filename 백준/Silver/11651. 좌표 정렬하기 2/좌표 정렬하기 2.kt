import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    var arr = ArrayList<Pair<Int, Int>>()

    for (i in 0 until n) {
        val input = br.readLine().split(" ")
        val x = input[0].toInt()
        val y = input[1].toInt()

        arr.add(Pair(x, y))
    }
    arr.sortWith { o1, o2 ->
        if (o1.second == o2.second) {
            o1.first - o2.first
        } else {
            o1.second - o2.second
        }
    }

    for ((x, y) in arr) {
        sb.append(x).append(" ").append(y).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}