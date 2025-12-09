import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = br.readLine().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()

    input = br.readLine().split(" ")
    val c = input[0].toInt()
    val d = input[1].toInt()

    val denom = (b * d).toLong()
    val numer = ((a * d) + (b * c)).toLong()
    val gcd = findGcd(numer, denom)

    val sb = StringBuilder()
    sb.append(numer / gcd).append(" ").append(denom / gcd)

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
