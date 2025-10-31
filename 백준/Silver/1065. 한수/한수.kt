import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var answer = 0
    for (i in 1..n) {
        val list = i.toString().map { it.digitToInt() }
        if (list.size == 1) answer++
        else {
            var pass = true
            val diff = list[1] - list[0]
            for(j in 0..<list.size-1) {
                if(list[j+1] - list[j] != diff) {
                    pass = false
                    break
                }
            }
            if(pass) answer++
        }
    }

    println(answer)
}
