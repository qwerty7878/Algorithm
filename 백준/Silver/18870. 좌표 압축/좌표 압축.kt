import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    val sorted = arr.distinct().sorted()

    val map = HashMap<Int, Int>()
    for(i in 0 until sorted.size) {
        map[sorted[i]] = i
    }

    for (i in 0 until arr.size) {
        sb.append(map.get(arr[i])).append(" ")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}