import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val str = br.readLine()
        map[str] = map.getOrDefault(str, 0) + 1
    }

    val max = map.maxOf{it.value}
    val filter = map.filter { it.value == max}.toSortedMap()
    println(filter.firstKey())
}
