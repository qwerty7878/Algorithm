import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()

    val gcd = findGcd(a, b)
    val lcm = (a * b) / gcd

    sb.append(lcm)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun findGcd(a: Long, b: Long): Long {
    if (b.toInt() == 0) {
        return a
    } else {
        return findGcd(b, a % b)
    }
}
