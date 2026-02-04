import kotlin.math.max
import kotlin.math.min

fun main() {
    var arr = Array(101) { BooleanArray(101) }
    repeat(4) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
        val minX = min(x1, x2)
        val minY = min(y1, y2)
        val maxX = max(x1, x2)
        val maxY = max(y1, y2)
        for (x in minX until maxX) {
            for (y in minY until maxY) {
                arr[x][y] = true
            }
        }
    }
    var answer = 0
    arr.forEach { answer += it.count { it } }
    println(answer)
}