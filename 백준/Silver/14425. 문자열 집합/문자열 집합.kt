import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val words = mutableSetOf<String>()
    for (i in 0 until n) {
        words.add(br.readLine())
    }

    var count = 0
    for (i in 0 until m) {
        val word = br.readLine()
        if (words.contains(word)) {
            count++
        }
    }
    sb.append(count)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}