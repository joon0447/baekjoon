import kotlin.math.floor
import kotlin.math.round


fun main() {
    val n = readLine()!!.toInt()
    if(n==0){
        println(0)
        return
    }

    val arr = IntArray(n)
    for(i in 0 until n){
        arr[i] = readLine()!!.toInt()
    }
    val sortedArr = arr.sorted()

    val rd = floor( n * 0.15 + 0.5).toInt()

    var sum = 0
    var count = 0
    for(i in rd until n-rd) {
        sum += sortedArr[i]
        count++
    }

    println(floor((sum/count.toDouble()) + 0.5).toInt())
}


