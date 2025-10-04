import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = br.readLine()
    val sp = line.split(" ")
    val a = sp[0].toInt()
    val b = sp[1].toInt()

    when {
        a>b -> println(">")
        a<b -> println("<")
        a==b -> println("==")
    }
}