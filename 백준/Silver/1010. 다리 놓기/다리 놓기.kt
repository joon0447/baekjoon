import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        println(combination(m, n))
    }
}

fun combination(n: Int, r: Int): Int {
    val dp = Array(n + 1) { IntArray(n + 1) }

    for (i in 0..n) {
        for (j in 0..i) {
            if (j == 0 || j == i) dp[i][j] = 1
            else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }

    return dp[n][r]
}