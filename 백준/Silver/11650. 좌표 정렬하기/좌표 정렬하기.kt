import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n =br.readLine().toInt()
    val arr = Array(n) {IntArray(2)}

    for(i in 0..<n) {
        val (a,b) = br.readLine().split(" ").map{it.toInt()}
        arr[i][0] = a
        arr[i][1] = b
    }

    arr.sortWith (compareBy({it[0]}, {it[1]}))

    val sb = StringBuilder()
    for(i in arr){
        sb.append("${i[0]} ${i[1]}\n")
    }

    println(sb.toString())
}
