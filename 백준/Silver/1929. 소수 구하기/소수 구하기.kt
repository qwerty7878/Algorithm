import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val m = st.nextToken().toInt()
    val n = st.nextToken().toInt()

    val sb = StringBuilder()
    for (i in m..n) {
        if (isPrime(i)) {
            sb.append(i).append("\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun isPrime(num: Int): Boolean {
    if (num < 2) {
        return false
    }else if (num == 2) {
        return true
    }else if (num % 2 == 0) {
        return false
    } else {
        for(i in 3..sqrt(num.toDouble()).toInt() step 2) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
}
