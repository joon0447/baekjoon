import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().trim().split(" ").map { it.toInt() }

    val map = mutableMapOf<String, String>()
    repeat(n){
        val list = br.readLine().split(" ")
        map[list[0]] = list[1]
    }

    val answer = StringBuilder()
    repeat(m){
        answer.append(map[br.readLine()])
        answer.append("\n")
    }

    println(answer.toString())
}
