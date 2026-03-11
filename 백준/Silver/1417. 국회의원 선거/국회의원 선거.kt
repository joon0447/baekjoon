import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val me = br.readLine().toInt()

    val pq = PriorityQueue<Int>(compareByDescending { it })
    for(i in 0 until n-1) {
        pq.add(br.readLine().toInt())
    }

    var count = 0
    var myVotes = me

    while (pq.isNotEmpty() && pq.peek() >= myVotes) {
        val top = pq.poll()
        pq.add(top - 1)
        myVotes++
        count++
    }

    println(count)
}
