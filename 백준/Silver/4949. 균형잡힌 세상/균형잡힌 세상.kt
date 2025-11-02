import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()
    while (true) {
        val str = br.readLine()
        if (str == ".") break

        val filter = str.replace(Regex("[^()\\[\\]]"), "")
        if (filter.isEmpty()) {
            answer.append("yes\n")
            continue
        }

        val stack = Stack<Char>()
        for (ch in filter) {
            if (ch == '(' || ch == '[') stack.push(ch)
            else {
                if (stack.isEmpty()) {
                    stack.push(ch)
                    break
                }

                if(ch == ')') {
                    if(stack.peek() == '(') stack.pop()
                    else break

                }

                if(ch ==']'){
                    if(stack.peek() == '[') stack.pop()
                    else break
                }
            }
        }

        if(stack.isEmpty()) answer.append("yes\n")
        else answer.append("no\n")
    }

    println(answer.toString())
}
