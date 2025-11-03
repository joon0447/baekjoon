import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }.sorted()
    val b = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    val s = a.indices.sumOf { a[it] * b[it]}
    println(s)
}
