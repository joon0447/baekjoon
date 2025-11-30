import java.util.Stack

fun main() {
    val n = readLine()!!.toInt()
    val stack = Stack<Int>()
    val answer = StringBuilder()

    var nextPush = 1

    for(i in 0 until n) {
        val target = readLine()!!.toInt()

        while(nextPush <= target) {
            stack.push(nextPush)
            answer.append("+\n")
            nextPush++
        }

        if(stack.peek() == target) {
            stack.pop()
            answer.append("-\n")
        } else {
            println("NO")
            return
        }
    }

    println(answer.toString())
}