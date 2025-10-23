import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val arr = Array(n) { IntArray(2)}

    for(i in 0..<n){
        val(a,b) = br.readLine().split(" ")
        arr[i][0] = a.toInt()
        arr[i][1] = b.toInt()
    }

    arr.sortWith(compareBy({ it[1] }, { it[0] }))

    val answer = StringBuilder()
    for(i in arr){
        answer.append("${i[0]} ${i[1]}\n")
    }


    println(answer.toString())
}
