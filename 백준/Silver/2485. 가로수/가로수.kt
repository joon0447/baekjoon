fun main() {
    val n = readLine()!!.toInt()
    val arr = LongArray(n)
    for (i in 0 until n) {
        arr[i] = readLine()!!.toLong()
    }

    val gaps = IntArray(n-1)
    for(i in 0 until n-1) {
        gaps[i] = (arr[i+1] - arr[i]).toInt()
    }

    var commonGap = gaps[0]
    for(i in 1 until gaps.size) {
        commonGap = gcd(commonGap, gaps[i])
    }

    val totalTreesNeeded = ((arr[n-1] - arr[0]) / commonGap) + 1
    println(totalTreesNeeded - n)
}

fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y!=0) {
        val tmp = x%y
        x = y
        y = tmp
    }
    return x
}
