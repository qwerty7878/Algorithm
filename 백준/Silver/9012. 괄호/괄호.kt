import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    repeat(n) {
        val stack = Stack<Char>()
        val input = br.readLine()
        for(c in input.toCharArray()) {
            if (c == '(') {
                stack.push(c)
            }else if (c == ')') {
                if (stack.isEmpty()) {
                    stack.push(c)
                } else if (stack.peek() == '(') {
                    stack.pop()
                }
            }
        }

        if (stack.isEmpty()) {
            sb.append("YES").append("\n")
        } else {
            sb.append("NO").append("\n")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}