import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    var answer = ""
    for(i in str.indices){
        if(str[i].isUpperCase()){
            answer += str[i].lowercase()
        }else{
            answer += str[i].uppercase()
        }
    }
    println(answer)
}
