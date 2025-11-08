import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    val list = mutableListOf<String>()

    for(i in 0..str.length-1) {
        list.add(str.substring(i))
    }

    list.sort()
    val answer = StringBuilder()
    list.forEach { answer.append("$it\n") }
    println(answer.toString())
}
