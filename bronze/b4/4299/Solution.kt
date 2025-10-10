import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b) = br.readLine().split(" ").map {it.toInt()}
    val sb = StringBuilder()
    if( a<b || (a+b)%2 != 0 || (a-b)%2 != 0){
        println(-1)
        return
    }

    sb.append((a+b)/2)
    sb.append(" ")
    sb.append((a-b)/2)

    println(sb.toString())

}