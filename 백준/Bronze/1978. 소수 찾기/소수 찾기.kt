import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    var answer = 0

    for(i in list){
        if(isPrime(i)) answer++
    }
    println(answer)
}

fun isPrime(n: Int): Boolean {
    if(n<2) return false
    if (n==2) return true
    if(n%2 ==0) return false

    val limit = sqrt(n.toDouble()).toInt()
    for(i in 3..limit step 2) {
        if(n%i==0) return false
    }
    return true
}
