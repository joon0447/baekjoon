import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val answer = StringBuilder()
    for (i in 1..t) {
        val str = br.readLine()
        val stack = Stack<Char>()
        for (char in str.toCharArray()) {
            if (char == '(') stack.push(char)
            else {
                if (stack.isEmpty()) {
                    stack.push(char)
                    break
                } else{
                    if(stack.peek() == '(') stack.pop()
                    else stack.push(char)
                }
            }
        }
        if(stack.isEmpty()) answer.append("YES\n")
        else answer.append("NO\n")
    }

    println(answer.toString())
}