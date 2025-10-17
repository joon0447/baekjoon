import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = ArrayList<Int>()
    for(i in 1..n){
        list.add(br.readLine().toInt())
    }

    list.sort()

    val answer = StringBuilder()
    for(i in list){
        answer.append(i)
        answer.append("\n")
    }

    println(answer.toString())
}
