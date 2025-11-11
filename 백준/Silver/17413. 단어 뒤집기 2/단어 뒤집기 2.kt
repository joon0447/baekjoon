import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()

    val stack = Stack<Char>()
    val answer = StringBuilder()
    var noReverse = false
    for (c in str) {
        when(c) {
            '<' -> {
                while(stack.isNotEmpty()) answer.append(stack.pop())

                noReverse = true
                answer.append(c)
            }
            '>' -> {
                noReverse = false
                answer.append(c)
            }
            ' ' -> {
                if(noReverse) {
                    answer.append(c)
                } else {
                    while(stack.isNotEmpty()) answer.append(stack.pop())
                    answer.append(' ')
                }
            }
            else -> {
                if(noReverse) {
                    answer.append(c)
                } else{
                    stack.push(c)
                }
            }
        }
    }

    while(stack.isNotEmpty()) answer.append(stack.pop())
    println(answer.toString())
}
