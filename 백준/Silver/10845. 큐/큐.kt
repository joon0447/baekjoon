import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val queue = ArrayDeque<Int>()
    val answer = StringBuilder()
    repeat(n) {
        val list = br.readLine().split(" ")
        when (list[0]) {
            "push" -> queue.add(list[1].toInt())
            "pop" -> {
                if(queue.isEmpty()) answer.append("-1\n")
                else answer.append("${queue.removeFirst()}\n")
            }
            "size" -> answer.append("${queue.size}\n")
            "empty" -> {
                if(queue.isEmpty()) answer.append("1\n")
                else answer.append("0\n")
            }
            "front" -> {
                if(queue.isEmpty()) answer.append("-1\n")
                else answer.append("${queue.first()}\n")
            }
            "back" -> {
                if(queue.isEmpty()) answer.append("-1\n")
                else answer.append("${queue.last()}\n")
            }
        }
    }

    println(answer.toString())
}
