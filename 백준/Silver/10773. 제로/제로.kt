import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()

    val n = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val input = br.readLine().toInt()

        if (input != 0) {
            stack.push(input)
        } else {
            stack.pop()
        }
    }

    val sum = stack.stream().mapToInt { it }.sum()
    sb.append(sum)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}