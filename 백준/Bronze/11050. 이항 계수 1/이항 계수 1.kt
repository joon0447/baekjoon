import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val answer = factorial(n) / (factorial(k) * factorial(n-k))
    println(answer)
}

fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}
