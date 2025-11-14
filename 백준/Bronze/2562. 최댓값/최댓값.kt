import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = mutableListOf<Int>()
    repeat(9) {
        list.add(br.readLine().toInt())
    }

    val max = list.maxOf{it}
    val index = list.indexOf(max) + 1

    println(max)
    println(index)
}
