import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    var min = Integer.MAX_VALUE
    var max = Integer.MIN_VALUE
    val list = br.readLine().trim().split(" ")
    for(i in list){
        var num = i.toInt()
        if(min > num) min = num
        if(max < num) max = num
    }

    println("$min $max")
}
