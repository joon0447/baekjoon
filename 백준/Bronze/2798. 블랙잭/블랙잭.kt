import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val list = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    var sum = 0

    for(i in 0 until n-2) {
        for(j in i+1 until n-1) {
            for(k in j+1 until n){
                val total = list[i] + list[j] + list[k]
                if(total <=m && total > sum) {
                    sum = total
                }
            }
        }
    }

    println(sum)
}
