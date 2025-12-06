import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()

    val score = IntArray(n+1)
    for (i in 1..n) {
        score[i] = readLine()!!.toInt()
    }

    if (n==1) {
        println(score[1])
        return
    }

    if(n==2) {
        println(score[1]+score[2])
        return
    }

    val dp = IntArray(n+1)
    dp[1] = score[1]
    dp[2] = score[1] + score[2]
    dp[3] = max(score[1] + score[3], score[2] + score[3])

    for(i in 4..n) {
        dp[i] = max(
            dp[i-2] + score[i],
            dp[i-3] + score[i-1] + score[i]
        )
    }

    println(dp[n])

}