import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }

    val result = IntArray(n) { 0 }

    for(i in 0 until n) {
        var count = list[i]
        for (j in 0 until n) {
            if (result[j] == 0) {
                if (count == 0) {
                    result[j] = i+1
                    break
                }
                count--
            }
        }
    }
    println(result.joinToString(" "))
}
