import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()

    val n = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val command = st.nextToken().toInt()
        if (command == 1) {
            val x = st.nextToken().toInt()
            stack.push(x)
        }else if (command == 2) {
            if (stack.isEmpty()) {
                sb.append(-1).append("\n")
            } else {
                sb.append(stack.pop()).append("\n")
            }
        }else if (command == 3) {
            sb.append(stack.size).append("\n")
        }else if (command == 4) {
            if (stack.isEmpty()) {
                sb.append(1).append("\n")
            } else {
                sb.append(0).append("\n")
            }
        }else if (command == 5) {
            if (stack.isEmpty()) {
                sb.append(-1).append("\n")
            } else {
                sb.append(stack.peek()).append("\n")
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}