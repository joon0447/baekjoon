
fun main() {
    val n = readLine()!!.toInt()
    val deque = ArrayDeque<Int>()
    for (i in n downTo 1) {
        deque.addLast(i)
    }
    val answer = StringBuilder()
    while(deque.size > 1) {
        answer.append("${deque.removeLast()} ")
        val last = deque.removeLast()
        deque.addFirst(last)
    }
    answer.append(deque.first())
    println(answer.toString())
}
