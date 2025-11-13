import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val dp = IntArray(12)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for(i in 4..11) {
        dp[i] = dp[i-1]+dp[i-2]+dp[i-3]
    }

    repeat(t) {
        val n =br.readLine().toInt()
        println(dp[n])
    }
}