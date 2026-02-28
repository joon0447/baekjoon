import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (k, n) = br.readLine().split(" ").map { it.toInt() }
    val lines = mutableListOf<Int>()
    repeat(k) {
        lines.add(br.readLine().toInt())
    }
    var left = 1L
    var right = lines.max().toLong()
    var answer = 0L
    while (left <= right) {
        val mid = (left + right) / 2L
        var total = 0L
        lines.forEach {
            total += it/mid
        }
        if(total >= n) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(answer)
}

