import java.io.BufferedReader
import java.io.InputStreamReader
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().split(" ")
    val r1 = arr[0]
    val s = arr[1]

    println(2*s.toInt() - r1.toInt())
}