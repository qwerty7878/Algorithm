import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val sb = StringBuilder()
    repeat(t) {
        var num = br.readLine().toLong()

        while (true) {
            if (isPrime(num)) {
                break
            }
            num++
        }
        sb.append(num).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun isPrime(num: Long): Boolean {
    if (num < 2) {
        return false
    }else if (num == 2L) {
        return true
    }else if (num % 2 == 0L) {
        return false
    } else {
        for(i in 3..sqrt(num.toDouble()).toLong() step 2) {
            if (num % i == 0L) {
                return false
            }
        }
        return true
    }
}