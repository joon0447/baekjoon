import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    var answer = 0
    val num = br.readLine().toCharArray()
    for(c in num) {
        answer += c.digitToInt()
    }
    println(answer)
}
