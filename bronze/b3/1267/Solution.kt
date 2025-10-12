import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ")
    val answer = StringBuilder()
    var sumY = 0
    var sumM = 0
    for(i in 0..<n){
        val time = arr[i].toInt()
        sumY += (time/30+1)*10
        sumM += (time/60+1)*15

    }


    if(sumY > sumM) answer.append("M ${sumM}")
    else if(sumY<sumM) answer.append("Y ${sumY}")
    else answer.append("Y M ${sumY}")

    println(answer.toString())
}
