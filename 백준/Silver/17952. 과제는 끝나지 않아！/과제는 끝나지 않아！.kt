import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var answer = 0
    val stack = Stack<Pair<Int, Int>>()
    repeat(n) {
        val str = br.readLine()
        if(str.length == 1){
            if(stack.isNotEmpty()){
                val pair = stack.pop()
                val min = pair.second - 1
                if(min == 0) {
                    answer += pair.first
                } else{
                    stack.push(Pair(pair.first, min))
                }
            }
        } else{
            val (b, a, t) = str.split(" ").map { it.toInt() }
            if(t-1 == 0) {
                answer += a
            } else{
                stack.push(Pair(a, t-1))
            }
        }
    }
    println(answer)
}
