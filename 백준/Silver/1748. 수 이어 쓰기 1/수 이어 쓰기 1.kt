
fun main() {
    val n = readLine()!!.toLong()

    var answer = 0L
    var start = 1L
    var len = 1L

    while (start <= n) {
        val end = minOf(n, start*10-1)
        val count = end - start + 1
        answer += count * len

        start *= 10
        len +=1
    }

    println(answer)
}