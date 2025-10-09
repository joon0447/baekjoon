import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val answer = StringBuilder()
    for(i in 1..n){
        for(j in i..n){
            answer.append("*")
        }
        answer.append("\n")
    }
    println(answer.toString())
}
