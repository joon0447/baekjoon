import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    repeat(n) {
        val sum =  br.readLine().split(" ").sumOf {it.toInt()}
        println(sum)
    }
}
