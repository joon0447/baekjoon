import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val str = br.readLine()

    val m = 1234567891L

    var answer = 0L
    var rPow = 1L

    for (c in str) {
        val s = (c.code - 96).toLong()

        answer = (answer + s * rPow) % m
        rPow = (rPow * 31L) % m
    }

    println(answer)
}
