import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.stream.Collectors

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val list = mutableListOf<String>()

    repeat(n) {
        list.add(br.readLine())
    }
    br.close()

    val answer = list
        .distinct()
        .sortedWith(compareBy({ it.length }, { it }))

    for (word in answer) {
        sb.append(word).append("\n")
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}