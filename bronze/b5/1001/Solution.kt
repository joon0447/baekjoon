import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = br.readLine()
    val sp = line.split(" ")
    println(Integer.parseInt(sp[0]) - Integer.parseInt(sp[1]))
}




