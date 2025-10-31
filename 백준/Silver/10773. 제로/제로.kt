import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack = Stack<Int>()

    val k = br.readLine().toInt()
    repeat(k) {
        val num = br.readLine().toInt()
        if(num != 0) stack.push(num)
        else {
            if(stack.isNotEmpty()) stack.pop()
        }
    }

    var answer = 0
    for(num in stack) {
        answer += num
    }

    println(answer)
}
