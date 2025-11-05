import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().trim().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }

    var answer = 0
    var index = 0
    while(index < n) {
        var sum = 0
        for(i in index until arr.size) {
            sum += arr[i]
            if(sum == m) {
                answer ++
                break
            }

            if(sum > m) break
        }
        index++
    }

    println(answer)
}
