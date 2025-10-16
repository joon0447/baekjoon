import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()

    val t = br.readLine().toInt()
    for(i in 1..t){
        val(r, s) = br.readLine().split(" ")
        for(char in s){
            for(j in 1..r.toInt()){
                answer.append(char)
            }
        }
        answer.append("\n")
    }

    println(answer.toString())
}
