import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ")
    var m = Integer.MIN_VALUE

    for(num in arr){
        if(m < num.toInt()) m = num.toInt()
    }

    var sum = 0.0
    for(num in arr){
        sum += num.toInt()/m.toDouble() * 100
    }

    println(sum/n)
}
