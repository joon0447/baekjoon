import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()

    repeat(n) {
        set.add(br.readLine())
    }
    var count = 0

    repeat(m) {
        if(set.contains(br.readLine())) count++
    }

    println(count)

}
