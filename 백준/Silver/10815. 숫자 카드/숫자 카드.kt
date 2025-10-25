import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val sangunCard = br.readLine().split(" ").map { it.toInt() }.toSet()
    br.readLine()
    val checkCard = br.readLine().split(" ").map { it.toInt() }.toSet()
    val answer = StringBuilder()

    for(num in checkCard) {
        if(num in sangunCard) {
            answer.append("1 ")
        } else{
            answer.append("0 ")
        }
    }


    println(answer.toString().trim())


}
