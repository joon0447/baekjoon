import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val m = br.readLine().toInt()
    var curr = 1

    for(i in 1..m){
        val (a,b) = br.readLine().split(" ").map {it.toInt()}
        if(a == curr){
            curr = b
        }else if(b == curr){
            curr = a
        }
    }

    println(curr)
}
