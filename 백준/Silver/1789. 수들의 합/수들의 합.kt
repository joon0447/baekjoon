import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine().toLong()

    var low = 1L
    var high = s
    var result = 0L
    while(low <= high) {
        val mid = (low + high) / 2
        val sum = mid * (mid+1) /2

        if(sum <= s) {
            result = mid
            low = mid+1
        } else{
            high = mid - 1
        }
    }

    println(result)
}
