import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val a = mutableSetOf<Int>()
    st = StringTokenizer(br.readLine())
    repeat(n) {
        a.add(st.nextToken().toInt())
    }

    val b = mutableSetOf<Int>()
    st = StringTokenizer(br.readLine())
    repeat(m) {
        b.add(st.nextToken().toInt())
    }

    val inter = a.intersect(b) as MutableSet<Int>
    val result = a.size + b.size - 2 * inter.size

    val sb = StringBuilder()
    sb.append(result)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}