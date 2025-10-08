import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(' ')
    val arr = arrayOf(1,1,2,2,2,8)
    val sb = StringBuilder()
    for(i in input.indices){
        val num = input[i].toInt()
        if(num == arr[i]) sb.append(0)
        else if(num > arr[i]) sb.append((num-arr[i]) * -1)
        else sb.append(arr[i] - num)
        sb.append(" ")
    }

    println(sb.toString())

}
