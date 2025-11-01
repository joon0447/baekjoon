import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()
    repeat(n) {
        set.add(br.readLine())
    }

    val answerSet = mutableSetOf<String>()
    repeat(m) {
        val name = br.readLine()
        if(set.contains(name)) {
            answerSet.add(name)
        }
    }

    println(answerSet.size)
    println(answerSet.sorted().joinToString("\n"))
}
