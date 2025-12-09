import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    val sb = StringBuilder()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        
        val gcd = findGcd(a, b)
        val lcm = (a * b) / gcd

        sb.append(lcm).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun findGcd(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return findGcd(b, a % b)
    }
}
