import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine()
    val b = br.readLine()
    val c = br.readLine()

    println(a.toInt()+b.toInt()-c.toInt())
    println((a.plus(b)).toInt() - c.toInt())
}
