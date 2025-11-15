import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    val (t, p) = br.readLine().split(" ").map { it.toInt() }

    var tCount = 0
    for(i in list) {
        if(i%t == 0) tCount += i/t
        else tCount += i/t + 1
    }

    println(tCount)
    println("${n/p} ${n%p}")
}
