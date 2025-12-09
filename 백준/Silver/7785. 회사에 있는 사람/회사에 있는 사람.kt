import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    var map = HashMap<String, String>()
    for (i in 0 until n) {
        val input = br.readLine()
        val name = input.split(" ")[0]
        val history = input.split(" ")[1]

        if (history.equals("leave")) {
            map.remove(name)
        } else {
            map.put(name, history)
        }
    }

    val nameList = map.keys.sortedDescending().toList()
    for (name in nameList) {
        sb.append(name).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}