import java.io.BufferedReader
import java.io.InputStreamReader

val list = mutableListOf<Long>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    for(i in 0..9) {
        fuck(i.toLong())
    }
    val sorted = list.sorted()
    if(n >= list.size) println(-1)
    else println(sorted[n])
}

fun fuck(num: Long) {
    if(num < 0) return
    list.add(num)
    val last = num % 10

    for(i in 0 until last) {
        val newNumber = num * 10 + i
        fuck(newNumber)
    }
}

