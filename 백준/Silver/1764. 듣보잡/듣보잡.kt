import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val people = mutableSetOf<String>()
    repeat(n) {
        val neverheard = br.readLine()
        people.add(neverheard)
    }

    val answer = mutableListOf<String>()
    repeat(m) {
        val neverSeen = br.readLine()
        if (people.contains(neverSeen)) {
            answer.add(neverSeen)
        }
    }
    val sorted = answer.sorted().toMutableList()

    val sb = StringBuilder()
    sb.append(sorted.size).append("\n")
    sb.append(sorted.joinToString("\n"))

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}