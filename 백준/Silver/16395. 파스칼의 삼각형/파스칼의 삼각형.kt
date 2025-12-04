fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val dp = Array(n) { IntArray(it + 1) }

    for (i in 0 until n){
        for(j in 0..i) {
            if(j==0 || j==i) dp[i][j] = 1
            else dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        }
    }

    println(dp[n-1][k-1])
}