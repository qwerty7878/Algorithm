import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val arr = ArrayList<Pair<Int, String>>()

    repeat(n) {
        val (age, name) = br.readLine().split(" ")
        arr.add(age.toInt() to name)
    }

    arr.sortWith(compareBy { it.first })

    for((name, age) in arr) {
        sb.append(name).append(" ").append(age).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}