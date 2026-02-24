import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val answer = StringBuilder()
    repeat(n) {
        var num = br.readLine().toLong()
        while (!isPrime(num)) {
            num++
        }
        answer.append(num).append('\n')
    }
    println(answer.toString())
}

fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0L || n % 3 == 0L) return false

    var i = 5L
    while (i * i <= n) {
        if (n % i == 0L || n % (i + 2) == 0L) return false
        i +=6
    }
    return true
}