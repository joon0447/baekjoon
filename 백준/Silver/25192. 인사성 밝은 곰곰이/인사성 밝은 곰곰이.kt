import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val set = mutableSetOf<String>()
    var answer = 0
    var isEnter = false
    repeat(n) {
        val name = br.readLine()
        if (name == "ENTER") {
            answer += set.size
            set.clear()
            isEnter = true
        } else {
            if(isEnter) {
                set.add(name)
            }
        }
    }
    if(set.isNotEmpty()) answer += set.size

    println(answer)
}
