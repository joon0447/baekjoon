import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val dp = Array(15) {IntArray(15)}

    for(n in 1..14){
        dp[0][n] = n
    }

    for(n in 1..14){
        for(i in 1..14) {
            dp[n][i] = if(i==1) {
                1
            } else{
                dp[n][i-1] + dp[n-1][i]
            }
        }
    }

    val sb = StringBuilder()
    repeat(t) {
        val k =br.readLine().toInt()
        val n = br.readLine().toInt()
        sb.append(dp[k][n]).append("\n")
    }

    println(sb.toString())
}
