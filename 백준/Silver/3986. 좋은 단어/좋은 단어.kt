import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var count = 0
    repeat(n) {
        val stack = Stack<Char>()

        for(c in br.readLine()){
            if(stack.isNotEmpty() && stack.peek() == c) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        if(stack.isEmpty()) count++
    }

    println(count)
}
