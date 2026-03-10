import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(' ').map { it.toInt() }
    val dp = IntArray(n){1}

    for(i in 0 until n) {
        for(j in 0 until i) {
            if(arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j]+1)
            }
        }
    }

    println(dp.max())
}
