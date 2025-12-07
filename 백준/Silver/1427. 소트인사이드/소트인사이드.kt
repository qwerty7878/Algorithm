import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val input = br.readLine()
    var arr = input.toCharArray().sortedDescending()

    for (num in arr) {
        sb.append(num)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}