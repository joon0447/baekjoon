import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val (h,w,n) = br.readLine().split(" ").map{it.toInt()}
        var index = 0
        for(x in 0 until w) {
            for(y in 0 until h) {
                index++
                if(index == n){
                    val room = (x+1).toString()
                        .padStart(2, '0')
                        .take(2)
                    println("${y+1}$room")
                }
            }
        }
    }
}
