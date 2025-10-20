import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val top : Int
    val bottom : Int

    var sum = 1
    var tmp = 0

    while(tmp < n) {
        tmp += sum
        sum++
    }

    if(sum%2 == 0) { 
        top = tmp - n + 1
        bottom = sum - top
    } else { 
        bottom = tmp - n + 1
        top = sum - bottom
    }

    println("$top/$bottom")
}
