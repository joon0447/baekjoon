import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val str = br.readLine()

    var count = 0
    var answer = 0L
    for(c in str) {
        val s = c.code - 96
        answer += (s * 31.0.pow(count)).toLong()
        count++
    }

    println(answer)
}
