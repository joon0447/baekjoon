import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val map = mutableMapOf<Int, Int>()
    br.readLine()
    val nList = br.readLine().split(" ").map{it.toInt()}
    br.readLine()
    val mList = br.readLine().split(" ").map{it.toInt()}

    val answer = StringBuilder()
    for(num in nList) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    for(num in mList){
        answer.append(map.getOrDefault(num, 0))
        answer.append(" ")
    }

    println(answer.toString().trim())
}
