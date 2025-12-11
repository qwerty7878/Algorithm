import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Arrays

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val max = 1000000
    val isPrime = BooleanArray(max + 1)
    Arrays.fill(isPrime, true)

    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..Math.sqrt(max.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..max step i) {
                isPrime[j] = false
            }
        }
    }

    val t = br.readLine().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val n = br.readLine().toInt()
        var count = 0

        for (i in 2..n / 2) {
            if (isPrime[i] and isPrime[n - i]) {
                count++
            }
        }
        sb.append(count).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}