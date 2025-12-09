import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val set = mutableSetOf<String>()

    for (i in 0 until s.length) {
        var ans = ""
        for (j in i until s.length) {
            ans += s[j]
            set.add(ans)
        }
    }

    val sb = StringBuilder()
    sb.append(set.size)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}