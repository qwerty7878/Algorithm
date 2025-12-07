import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }
    arr.sort()

    for (num in arr) {
        sb.append(num).append("\n")
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}