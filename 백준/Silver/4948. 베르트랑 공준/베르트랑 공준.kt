import java.io.BufferedReader
import java.io.InputStreamReader

val max = 246912
val isPrime = BooleanArray(max + 1) { true }

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()
    gcd()

    while (true) {
        val num = br.readLine().toInt()
        if(num == 0) break
        answer.append(count(num)).append("\n")
    }
    println(answer.toString())
}

fun count(num: Int): Int {
    var count = 0
    for(i in num + 1 .. num * 2) {
        if(isPrime[i]) count++
    }
    return count
}

fun gcd() {
    isPrime[0] = false
    isPrime[1] = false
    var i = 2
    while (i * i <= max) {
        if(isPrime[i]) {
            for(j in i * i..max step i) {
                isPrime[j] = false
            }
        }
        i++
    }
}
