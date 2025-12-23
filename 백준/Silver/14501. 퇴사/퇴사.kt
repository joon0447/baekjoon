fun main() {
    val n = readLine()!!.toInt()
    val t = IntArray(n + 2)
    val p = IntArray(n + 2)

    for (i in 1..n) {
        val (ti, pi) = readLine()!!.split(" ").map { it.toInt() }
        t[i] = ti
        p[i] = pi
    }

    val dp = IntArray(n+2)
    for(i in n downTo 1) {
        val endDay = i + t[i] - 1
        dp[i] = if (endDay <= n) {
            maxOf(p[i]+dp[i+t[i]], dp[i+1])
        } else dp[i+1]
    }

    println(dp[1])
}