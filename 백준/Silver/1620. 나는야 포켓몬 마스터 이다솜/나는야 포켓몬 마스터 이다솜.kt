import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val numKeyMap = mutableMapOf<Int, String>()
    val nameKeyMap = mutableMapOf<String, Int>()
    for(i in 1..n){
        val name = br.readLine()
        numKeyMap[i] = name
        nameKeyMap[name] = i
    }

    val answer = StringBuilder()
    repeat(m){
        val input = br.readLine()
        if(input.toIntOrNull() == null){
            val a = nameKeyMap[input]
            answer.append("$a\n")
        }
        else{
            val a = numKeyMap[input.toInt()]
            answer.append("$a\n")
        }
    }

    println(answer.toString())

}
