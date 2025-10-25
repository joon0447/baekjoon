import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = Array(100) { BooleanArray(100) }
    var answer = 0
    repeat(n) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        for (i in 0..9) {
            for(j in 0..9){
                if(arr[a+i][b+j]) continue
                arr[a+i][b+j] = true
                answer++
            }
        }
    }

    println(answer)
}