import kotlin.math.min

private lateinit var graph: Array<MutableList<Int>>
private lateinit var visitedDfs: BooleanArray
private lateinit var visitedBfs: BooleanArray
private val dfsResult = StringBuilder()
private val bfsResult = StringBuilder()

fun main() {
    val (n, m, v) = readLine()!!.split(" ").map { it.toInt() }
    graph = Array(n + 1) { mutableListOf() }

    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    for (i in 1..n) {
        graph[i].sort()
    }

    visitedDfs = BooleanArray(n + 1)
    visitedBfs = BooleanArray(n+1)

    dfs(v)
    bfs(v)

    println(dfsResult.toString())
    println(bfsResult.toString())
}

private fun dfs(node: Int) {
    visitedDfs[node] = true
    dfsResult.append("$node ")

    for(next in graph[node]) {
        if (!visitedDfs[next]) {
            dfs(next)
        }
    }
}

private fun bfs(start: Int) {
    val queue: ArrayDeque<Int> = ArrayDeque()
    queue.add(start)
    visitedBfs[start] = true

    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()
        bfsResult.append("$cur ")

        for (next in graph[cur]) {
            if (!visitedBfs[next]) {
                visitedBfs[next] = true
                queue.add(next)
            }
        }
    }
}