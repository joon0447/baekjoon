import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    val answer = StringBuilder()
    repeat(n) {
        val list = br.readLine().split(" ")
        when(list[0]) {
            "1" -> stack.push(list[1].toInt())
            "2" -> if(stack.isEmpty()) answer.append("-1\n") else answer.append("${stack.pop()}\n")
            "3" -> answer.append("${stack.size}\n")
            "4" -> if(stack.isEmpty()) answer.append("1\n") else answer.append("0\n")
            "5" -> if(stack.isEmpty()) answer.append("-1\n") else answer.append("${stack.peek()}\n")
        }
    }

    println(answer.toString())
}
