import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map{it.toInt()}.sortedBy { it }
    var total = 0
    var last = 0
    for(num in arr) {
        last += num
        total += last
    }
    println(total)
}
