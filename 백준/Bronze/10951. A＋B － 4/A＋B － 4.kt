import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while(true) {
        val line = br.readLine() ?: return
        val sum =  line.split(" ").sumOf {it.toInt()}
        println(sum)
    }

}
