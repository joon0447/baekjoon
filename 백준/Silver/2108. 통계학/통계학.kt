import kotlin.math.round

fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)

    var sum = 0
    for(i in 0 until n) {
        arr[i] = readLine()!!.toInt()
        sum += arr[i]
    }
    val map = mutableMapOf<Int, Int>()
    for(i in arr){
        map[i] = map.getOrDefault(i, 0) + 1
    }

    val maxCount = map.values.maxOrNull()!!
    val modes = map.filterValues {it == maxCount}.keys.sorted()
    val mode = if(modes.size >= 2) modes[1] else modes[0]



    val sortedArr = arr.sorted()
    println(round(sum / n.toDouble()).toInt())
    println(sortedArr[n/2])
    println(mode)
    println(sortedArr[n-1] - sortedArr[0])
}