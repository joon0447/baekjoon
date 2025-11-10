import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }.sorted()

    var answer = 0
    for(i in 0 until n-1) {
        for(j in i+1 until n) {
            if(list[i]+list[j] == m) answer++

            if(list[i]+list[j] > m) break
        }
    }

    println(answer)
}
