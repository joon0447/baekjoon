import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()
    while(true) {
        val (a,b) = br.readLine().split(" ").map {it.toInt()}
        if(a == 0 && b == 0) break

        if(a > b) answer.append("Yes\n")
        else answer.append("No\n")
    }

    println(answer.toString())
}
