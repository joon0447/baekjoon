import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val deque = ArrayDeque<Int>()

    for (i in 1..n) {
        deque.addFirst(i)
    }

    while(deque.size != 1) {
        deque.removeLast()
        val num = deque.removeLast()
        deque.addFirst(num)
    }

    println(deque.get(0))
}
