import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val numToPocketName = mutableMapOf<Int, String>()
    val nameToPocketNum = mutableMapOf<String, Int>()

    for (i in 0 until n) {
        val pocketname = br.readLine()
        numToPocketName.put((i + 1), pocketname)
        nameToPocketNum.put(pocketname, (i + 1))
    }

    val sb = StringBuilder()
    for (i in 0 until m) {
        val question = br.readLine()
        if (Character.isDigit(question[0])) {
            val num = question.toInt()
            sb.append(numToPocketName.get(num))
        } else {
            sb.append(nameToPocketNum.get(question))
        }
        sb.append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}