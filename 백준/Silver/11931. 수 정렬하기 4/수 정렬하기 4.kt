import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val n = readln().toInt()
    val arr = IntArray(n)
    val br = BufferedReader(InputStreamReader(System.`in`))

    val answer = StringBuilder()
    for(i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }

    arr.sortDescending()
    arr.forEach {
        answer.append("$it\n")
    }
    println(answer.toString())
}