import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val arr = mutableListOf<Int>()
    repeat(t) {
        arr.add(br.readLine().toInt())
    }

    var gcd = arr[1] - arr[0]
    for (i in 2 until t) {
        val diff = arr[i] - arr[i - 1]
        gcd = findGcd(gcd, diff)
    }

    var count = 0
    for (i in 0 until t - 1) {
        if (arr[i] + gcd == arr[i + 1]) {
            continue
        } else {
            var num = arr[i]
            while (true) {
                if (num + gcd == arr[i + 1]) {
                    break
                }
                num += gcd
                count++
            }
        }
    }
    val sb = StringBuilder()
    sb.append(count)

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
