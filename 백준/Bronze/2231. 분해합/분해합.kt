import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var answer = 0
    val digitCount = n.toString().length
    val start = maxOf(1, n-9*digitCount)

    for(i in start until n) {
        var sum = i
        var tmp = i

        while (tmp >0) {
            sum += tmp % 10
            tmp /=10
        }

        if(sum == n) {
            answer = i
            break
        }
    }

    println(answer)
}
