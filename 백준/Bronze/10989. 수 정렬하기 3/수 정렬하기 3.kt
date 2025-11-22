import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = IntArray(10001)

    repeat(n) {
        val num = br.readLine().toInt()
        arr[num]++
    }

    val answer = StringBuilder()
    for(i in 1..10000) {
        var c = arr[i]
        while(c > 0) {
            answer.append(i).append("\n")
            c--
        }
    }

    println(answer.toString())
}
