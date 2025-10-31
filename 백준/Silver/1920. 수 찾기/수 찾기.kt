import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val set = br.readLine().split(" ").toSet()
    val m = br.readLine().toInt()
    val list = br.readLine().split(" ")
    val answer = StringBuilder()
    for(num in list){
        if(set.contains(num)) answer.append("1\n")
        else answer.append("0\n")
    }

    println(answer.toString())

}
