import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val b = br.readLine()
    val answer = StringBuilder()

    for(ch in b.reversed()){
        answer.append(a * ch.digitToInt())
        answer.append("\n")
    }

    answer.append(a*b.toInt())
    println(answer.toString())
}