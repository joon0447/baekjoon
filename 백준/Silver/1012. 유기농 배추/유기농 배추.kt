import kotlin.math.min


private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)


fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var count = 0
        val (m, n, k) = readLine()!!.split(" ").map { it.toInt() }
        val board = Array(n) { IntArray(m) }
        val visited = Array(n) { BooleanArray(m) }
        repeat(k) {
            val (x, y) = readLine()!!.split(" ").map { it.toInt() }
            board[y][x] = 1
        }

        for (i in 0 until n) {
            for(j in 0 until m) {
                if (board[i][j] == 1  && !visited[i][j]) {
                    dfs(i,j,board,visited,n,m)
                    count++
                }
            }
        }
        println(count)
    }
}

fun dfs(
    y:Int,
    x:Int,
    board: Array<IntArray>,
    visited: Array<BooleanArray>,
    n: Int,
    m: Int
) {
    visited[y][x] = true

    for(dir in 0..3) {
        val ny = y + dy[dir]
        val nx = x + dx[dir]

        if (ny in 0 until n && nx in 0 until m) {
            if (board[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(ny,nx,board, visited, n, m)
            }
        }
    }
}