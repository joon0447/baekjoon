import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val people = (1..n).toMutableList()
    var index = 0
    val answer = mutableListOf<Int>()
    while (people.isNotEmpty()) {
        index = (index + k -1) % people.size
        answer.add(people.removeAt(index))
    }

    println("<${answer.joinToString(", ")}>")
}
