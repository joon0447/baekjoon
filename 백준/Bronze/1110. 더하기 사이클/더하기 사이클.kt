import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine()

    if(n.toInt() < 10) n +="0"
    val first = n
    var count = 0

    while(true){
        val(a,b) = n.map {it.toString()}
        n = b + (a.toInt() + b.toInt()).toString().last()
        count++
        if(first == n){
            println(count)
            break;
        }
    }
}
