import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val cards = br.readLine().split(" ").map { it.toInt() }.toSet()

    val m = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }
    for (card in numbers) {
        if (card in cards) {
            sb.append(1).append(" ")
        } else {
            sb.append(0).append(" ")
        }
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}