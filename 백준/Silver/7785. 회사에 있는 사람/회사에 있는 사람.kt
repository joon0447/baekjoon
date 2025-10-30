import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val set = mutableSetOf<String>()

    val n = br.readLine().toInt()
    repeat(n) {
        val (name, type) = br.readLine().split(" ")
        if (type == "enter") set.add(name)
        else set.remove(name)
    }

    val answer = StringBuilder()
    set.sorted().reversed().iterator().forEach {
        answer.append("$it\n")
    }
    println(answer.toString())

}
