import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    while (true) {
        val stack = Stack<Char?>()
        val input = br.readLine()

        if (input == ".") {
            break
        }

        for (c in input.toCharArray()) {
            if (c == '[' || c == '(') {
                stack.push(c)
            }
            if (stack.isEmpty()) {
                if (c == ')' || c == ']') {
                    stack.push(c)
                }
            } else {
                if ((c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[')) {
                    stack.push(c)
                } else if ((c == ']' && stack.peek() == '[') || (c == ')' && stack.peek() == '(')) {
                    stack.pop()
                }
            }
        }

        if (stack.isEmpty()) {
            sb.append("yes").append('\n')
        } else {
            sb.append("no").append('\n')
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}