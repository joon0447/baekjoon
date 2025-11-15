import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var max = 1
    var step = 1

    while (n > max) {
        max += 6 * step
        step++
    }

    println(step)
}
