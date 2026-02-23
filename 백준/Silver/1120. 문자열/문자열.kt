import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (a,b) = br.readLine().split(" ")
    val diff = b.length - a.length
    var answer = Int.MAX_VALUE
    for(i in 0..diff) {
        var count = 0
        for(j in i until a.length) {
            if(a[j] != b[j]) {
                count++
            }
        }
        a = " $a"
        answer = min(count, answer)
    }

    println(answer)
}