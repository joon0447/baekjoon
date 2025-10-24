import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val map = mutableMapOf<String, Int>()
    val list = mutableListOf<IntArray>()
    val n = br.readLine().toInt()

    for (i in 1..n) {
        val (x, y) = br.readLine().split(" ")
        list.add(intArrayOf(x.toInt(), y.toInt()))
    }

    for (i in 0..<n) {
        val x = list[i][0]
        val y = list[i][1]
        var count = 0
        for(j in 0..<n){
            if(i==j) continue
            if(x < list[j][0] && y < list[j][1]) count++
        }
        map[i.toString()] = count+1
    }

    val sb = StringBuilder()
    for(i in 0..map.size-1){
        sb.append(map[i.toString()])
        sb.append(" ")
    }

    println(sb.trim().toString())

}
