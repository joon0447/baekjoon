import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    var answer = Int.MIN_VALUE
    var current = 0

    for(i in 0 until n) {
        current += arr[i]
        answer = max(answer, current)
        if(current < 0) {
            current = 0
        }
    }
    println(answer)
}
