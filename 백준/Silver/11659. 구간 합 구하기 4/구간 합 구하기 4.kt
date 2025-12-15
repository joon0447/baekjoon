fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }
    val sumArr = IntArray(n+1)

    var total = 0
    for(i in 0..< list.size) {
        total += list[i]
        sumArr[i+1] = total
    }

    repeat(m) {
        val (start, end) = readLine()!!.split(" ").map { it.toInt() }
        if(start == 1) {
            println(sumArr[end])
        } else {
            println(sumArr[end] - sumArr[start-1])
        }
    }
}