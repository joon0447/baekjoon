import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt() 
    val m = br.readLine().toInt()
    
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val visited = BooleanArray(n + 1)
    val queue: Queue<Int> = LinkedList()
    queue.add(1)
    visited[1] = true

    var count = 0

    while (queue.isNotEmpty()) {
        val v = queue.poll()
        for (next in graph[v]) {
            if (!visited[next]) {
                visited[next] = true
                queue.add(next)
                count++
            }
        }
    }

    println(count)
}