import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val board = Array(n) {br.readLine().toCharArray()}
    var answer = Int.MAX_VALUE

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            var countWStart = 0
            var countBStart = 0

            for (x in 0 until 8) {
                for (y in 0 until 8) {
                    val current = board[i + x][j + y]

                    if ((x + y) % 2 == 0) {
                        if (current != 'W') countWStart++
                        if (current != 'B') countBStart++
                    } else {
                        if (current != 'B') countWStart++
                        if (current != 'W') countBStart++
                    }
                }
            }

            answer = min(answer, min(countWStart, countBStart))
        }
    }

    println(answer)
}
