import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val answer = StringBuilder()
    repeat(n) {
        val str = br.readLine()
        var a = ""
        var b = 0
        if(str.split(" ")[0] == "push"){
            b = str.split(" ")[1].toInt()
        }
        a = str.split(" ")[0]
        when(a) {
            "push" -> {
                stack.push(b)
            }
            "pop" -> {
                if(stack.isEmpty()) answer.append("-1\n")
                else answer.append("${stack.pop()}\n")
            }
            "size" -> {
                answer.append("${stack.size}\n")
            }
            "empty" -> {
                if(stack.isEmpty()) answer.append("1\n")
                else answer.append("0\n")
            }
            "top" -> {
                if(stack.isEmpty()) answer.append("-1\n")
                else answer.append("${stack.peek()}\n")
            }
        }
    }

    println(answer.toString())

}
