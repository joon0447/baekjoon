import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine().trim()

    if(str.isEmpty()) println(0)
    else println(str.split(" ").size)
}
