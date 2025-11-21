import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, v) = br.readLine().split(" ").map { it.toInt() }

    val answer = (v-b-1) / (a-b)+1
    println(answer)
}
