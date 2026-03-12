import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)
    var count = 0

    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    for(i in 1..n) {
        if (!visited[i]) {
            bfs(i, graph, visited)
            count++
        }
    }
    println(count)
}

fun bfs(start: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
    val queue = ArrayDeque<Int>()
    queue.add(start)
    visited[start] = true
    while (queue.isNotEmpty()) {
        val num = queue.removeFirst()
        for(next in graph[num]) {
            if(!visited[next]) {
                visited[next] = true
                queue.add(next)
            }
        }
    }
}
