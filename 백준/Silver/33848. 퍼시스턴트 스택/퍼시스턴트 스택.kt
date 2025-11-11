import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val q = br.readLine().toInt()
    val stack = Stack<Int>()
    val record = Stack<Pair<Int, Int>>()
    val answer = StringBuilder()
    repeat(q) {
        val arr = br.readLine().split(" ").map { it.toInt() }
        when (arr[0]) {
            1 -> {
                record.push(Pair(arr[0], arr[1]))
                stack.push(arr[1])
            }

            2 -> {
                record.push(Pair(2, stack.pop()))
            }

            3 -> {
                repeat(arr[1]) {
                    val pair = record.pop()
                    if (pair.first == 1) stack.pop()
                    else stack.push(pair.second)
                }
            }
            4 -> answer.append("${stack.size}\n")
            5 -> {
                if(stack.isEmpty()) answer.append("-1\n")
                else answer.append("${stack.peek()}\n")
            }
        }
    }

    println(answer.toString())
}
