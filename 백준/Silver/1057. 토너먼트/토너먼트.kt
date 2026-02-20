import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (n, a, b) = br.readLine().split(" ").map { it.toInt() }

    var answer = 0
    while (a != b) {
        a = (a + 1) / 2
        b = (b + 1) / 2
        answer++
    }
    println(answer)
}