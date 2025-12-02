
fun main() {
    val n = readLine()!!.toInt()
    val dp = IntArray(n+1)
    dp[0] = 0
    if(n>=1) dp[1] = 1

    for(i in 2..n){
        dp[i] = dp[i-1] + dp[i-2]
    }

    println(dp[n])

}