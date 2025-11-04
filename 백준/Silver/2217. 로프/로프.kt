import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = mutableListOf<Int>()
    var max = 0
    repeat(n) {
        list.add(br.readLine().toInt())
    }
    list.sortDescending()

    for(i in 0 until list.size) {
        val value = list[i] * (i+1)
        if(max <value) {
            max = value
        }
    }

    println(max)
}
