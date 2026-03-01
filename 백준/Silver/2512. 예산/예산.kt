import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val money = br.readLine().toInt()

    var left = 0
    var right = list.max()
    var answer = 0

    while (left <= right) {
        val mid = (left + right) / 2
        var total = 0
        list.forEach { 
            if(it >= mid) total += mid
            else total += it
        }
        if (total <= money) {
            left = mid + 1
            answer = mid
        } else {
            right = mid - 1
        }
    }
    println(answer)
}

