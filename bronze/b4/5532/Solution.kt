import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val l = br.readLine().toInt()
    val a = br.readLine().toInt() // 국어 풀어야 되는 페이지
    val b = br.readLine().toInt() // 수학 풀어야 되는 페이지
    val c = br.readLine().toInt() // 하루 최대 풀 수 있는 국어 페이지
    val d = br.readLine().toInt() // 하루 최대 풀 수 있는 수학 페이지

    var kr = 0
    if(a%c == 0){
        kr = a/c
    }else{
        kr = (a/c) + 1
    }

    var math = 0
    if(b%d == 0){
        math = b/d
    }else{
        math = (b/d) +1
    }

    val max = max(kr, math)
    println(l-max)
}
