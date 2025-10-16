import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine().uppercase()
    val count = str.groupingBy { it }.eachCount()
    val max = count.values.max()
    val maxChars = count.filter {it.value == max}.keys

    if(maxChars.size > 1) println("?")
    else println(maxChars.first())
}
