import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val a = br.readLine().split(".")[1]
        map[a] = map.getOrDefault(a,0) + 1
    }

    map.toSortedMap().forEach {
        println("${it.key} ${it.value}")
    }

}
