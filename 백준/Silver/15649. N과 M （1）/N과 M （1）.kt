import java.io.BufferedReader
import java.io.InputStreamReader

var n = 0
var m = 0
val sb = StringBuilder()
lateinit var arr: BooleanArray
lateinit var result: IntArray

fun dfs(depth: Int) {
    if (depth == m) {
        for (i in 0 until m) {
            sb.append(result[i]).append(" ")
        }
        sb.append("\n")
        return
    }

    for (i in 1..n) {
        if (!arr[i]) {
            arr[i] = true
            result[depth] = i
            dfs(depth + 1)
            arr[i] = false
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    n = a
    m = b

    arr = BooleanArray(n+1)
    result = IntArray(m)

    dfs(0)
    println(sb)

}
