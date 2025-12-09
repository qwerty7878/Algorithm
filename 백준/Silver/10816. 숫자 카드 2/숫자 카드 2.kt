import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.HashMap
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val map = HashMap<Int, Int>()

    var st = StringTokenizer(br.readLine())
    repeat(n) {
        val input = st.nextToken().toInt()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    val m = br.readLine().toInt()

    st = StringTokenizer(br.readLine())
    val sb = StringBuilder()
    repeat(m) {
        val num = st.nextToken().toInt()
        sb.append(map.getOrDefault(num, 0)).append(" ")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}