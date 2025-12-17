fun main() {
    val n = readLine()!!.toInt()

    val dp = IntArray(n+4)
    dp[1] = 1
    dp[2] = 3
    dp[3] = 5

    for(i in 4..n) {
        dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007
    }

    println(dp[n])
}