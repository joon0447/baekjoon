import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().split(" ")
    val num = arr[0].toInt() * arr[1].toInt()
    val arr2 = br.readLine().split(" ")
    val answer = StringBuilder()
    for(n in arr2) {
        answer.append("${n.toInt()-num} ")
    }
    println(answer.toString().trim())
}
