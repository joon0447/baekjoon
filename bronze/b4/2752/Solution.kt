import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().split(" ").map { it.toInt() }
    val sortedArr =arr.sorted()
    val answer = StringBuilder()

    for(i in sortedArr){
        answer.append("$i ")
    }

    println(answer.toString().trim())
}
