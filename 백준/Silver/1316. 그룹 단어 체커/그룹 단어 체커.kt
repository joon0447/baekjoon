import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var answer = 0;
    for(i in 1..n){
        val str = br.readLine()
        val list = ArrayList<Char>()
        var last = ' '
        var pass = true
        for(ch in str){
            if(last == ' ') last = ch
            if(last != ch){
                if(list.contains(ch)){
                    pass = false
                    break
                }
                list.add(last)
                last = ch
            }
        }

        if(pass) answer++
    }
    println(answer)
}
