import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    val dp0 = IntArray(41)
    val dp1 = IntArray(41)

    dp0[0] = 1
    dp1[0] = 0
    dp0[1] = 0
    dp1[1] = 1

    for(i in 2..40) {
        dp0[i] = dp0[i-1] + dp0[i-2]
        dp1[i] = dp1[i-1] + dp1[i-2]
    }

    repeat(t) {
        val n = br.readLine().toInt()
        println("${dp0[n]} ${dp1[n]}")
    }
}
