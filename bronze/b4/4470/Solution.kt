import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    var count = 1

    val n = br.readLine().toInt()

    for(i in 1..n){
        sb.append("${count++}. ${br.readLine()}\n")
    }

    println(sb.toString())

}