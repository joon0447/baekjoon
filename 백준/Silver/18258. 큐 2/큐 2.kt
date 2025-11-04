import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val q = ArrayDeque<Int>()
    val answer = StringBuilder()
    repeat(n) {
        val str = br.readLine().split(" ")

        when (str[0]) {
            "push" -> q.add(str[1].toInt())
            "pop" -> {
                if(q.isEmpty()) answer.append("-1\n")
                else answer.append("${q.removeFirst()}\n")
            }
            "size" -> answer.append("${q.size}\n")
            "empty" -> {
                if(q.isEmpty()) answer.append("1\n")
                else answer.append("0\n")
            }
            "front" -> {
                if(q.isEmpty()) answer.append("-1\n")
                else answer.append("${q.first()}\n")
            }
            "back" -> {
                if(q.isEmpty()) answer.append("-1\n")
                else answer.append("${q.last()}\n")
            }
        }
    }

    println(answer.toString())
}
