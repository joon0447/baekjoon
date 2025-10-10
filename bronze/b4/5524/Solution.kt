import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()

    for(i in 1..n){
        sb.append("${br.readLine().toString().lowercase()}\n")
    }

    println(sb.toString())

}