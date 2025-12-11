import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var count = 1
    for(i in 2..sqrt(n.toDouble()).toInt()) {
        count++
    }

    val sb = StringBuilder()
    sb.append(count)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}