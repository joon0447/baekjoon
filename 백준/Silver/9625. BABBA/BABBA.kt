import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val k = br.readLine().toInt()
    val arr = Array(46) { Pair(0, 0) }
    arr[1] = Pair(0,1)
    arr[2] = Pair(1,1)
    for(i in 3..k) {
        arr[i] = Pair(arr[i-1].first + arr[i-2].first , arr[i-1].second + arr[i-2].second)
    }

    println("${arr[k].first} ${arr[k].second}")
}