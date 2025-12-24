import java.util.PriorityQueue

fun main() {
    val n = readLine()!!.toInt()
    val pq = PriorityQueue<Int>()
    val answer = StringBuilder()
    repeat(n) {
        val x = readLine()!!.toInt()
        if(x==0) {
            if(pq.isEmpty()) answer.append("0\n")
            else {
                answer.append("${pq.poll()}\n")
            }
        } else {
            pq.add(x)
        }
    }

    println(answer.toString())
}