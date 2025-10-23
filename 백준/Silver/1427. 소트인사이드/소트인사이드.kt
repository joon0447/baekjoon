import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = br.readLine().map {it.toString().toInt()}

    val sorted = list.sorted().reversed()

    println(sorted.joinToString(""))

}
