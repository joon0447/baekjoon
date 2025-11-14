import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    repeat(n) {
        var sum = 0
        var total = 0
        val str = br.readLine()
        for(s in str) {
            if(s=='O'){
                sum++
                total += sum
            }
            else {
                sum = 0
            }
        }
        println(total)
    }
}
