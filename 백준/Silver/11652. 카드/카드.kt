import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val map = mutableMapOf<Long, Int>()
    repeat(n) {
        val num = br.readLine().toLong()
        map[num] = map.getOrDefault(num, 0) + 1
    }

    val sorted = map.entries
        .sortedWith(
            compareByDescending<Map.Entry<Long, Int>> { it.value }
                .thenBy { it.key }
        )

    println(sorted.first().key)
}