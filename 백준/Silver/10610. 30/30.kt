import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.forEach

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()

    if(!n.contains("0")){
        println(-1)
        return
    }

    val list = n.map {it.digitToInt()}.sortedDescending()

    var sum = 0
    list.forEach {
        sum += it
    }

    if(sum%3==0) println(list.joinToString(""))
    else println(-1)
}
