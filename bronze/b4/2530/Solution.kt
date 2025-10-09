import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val time = br.readLine().split(" ")
    val d = br.readLine().toInt()
    val sec = time[0].toInt() * 3600 + time[1].toInt() * 60 + time[2].toInt() + d

    val answer = StringBuilder()

    answer.append("${sec/3600%24} ${sec%3600/60} ${sec%60}")
    println(answer.toString())
}
