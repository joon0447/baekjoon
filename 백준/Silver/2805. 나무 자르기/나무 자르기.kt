import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val trees = br.readLine().split(" ").map { it.toInt() }

    var left = 0
    var right = trees.max()
    var answer = 0
    while (left <= right) {
        val mid = (left + right) / 2
        var total = 0L
        trees.forEach { tree ->
            if (tree - mid > 0) total += tree - mid
        }
        if(total >= m) {
            answer = mid
            left = mid + 1
        }
        else right = mid - 1
    }
    println(answer)
}

