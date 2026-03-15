import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val answer = StringBuilder()
    repeat(n) {
        val num = br.readLine().toInt()
        if (num == 0) {
            if(pq.isEmpty()) answer.append("0\n")
            else answer.append(pq.poll()).append("\n")
        } else pq.add(num)
    }
    println(answer.toString())
}
