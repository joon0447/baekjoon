import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val deque = ArrayDeque<Int>()

    val n = br.readLine().toInt()
    val answer = StringBuilder()
    repeat(n) {
        val str = br.readLine().split(" ")
        when (str[0]) {
            "push_back" -> deque.addLast(str[1].toInt())
            "push_front" -> deque.addFirst(str[1].toInt())
            "pop_front" -> {
                if(deque.isEmpty()) answer.append("-1\n")
                else answer.append("${deque.removeFirst()}\n")
            }
            "pop_back" -> {
                if(deque.isEmpty()) answer.append("-1\n")
                else answer.append("${deque.removeLast()}\n")
            }
            "size" -> answer.append("${deque.size}\n")
            "empty" -> {
                if(deque.isEmpty()) answer.append("1\n")
                else answer.append("0\n")
            }
            "front" -> {
                if(deque.isEmpty()) answer.append("-1\n")
                else answer.append("${deque.first()}\n")
            }
            "back" -> {
                if(deque.isEmpty()) answer.append("-1\n")
                else answer.append("${deque.last()}\n")
            }
        }
    }

    println(answer.toString())
}
