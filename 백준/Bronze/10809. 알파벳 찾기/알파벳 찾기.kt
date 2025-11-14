import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()

    val answer = StringBuilder()
    for(c in 'a'..'z'){
        val index = str.indexOfFirst { it == c }
        answer.append("$index ")
    }


    println(answer.toString())
}
