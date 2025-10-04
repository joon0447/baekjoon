import java.io.BufferedReader
import java.io.InputStreamReader
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().split(" ")
    var total = 0
    for(i in 0..4){
        total += arr[i].toInt() * arr[i].toInt()
    }

    println(total%10)
}