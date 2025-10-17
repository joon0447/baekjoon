import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = listOf("dz=", "c=", "c-",  "d-", "lj", "nj", "s=", "z=").sortedByDescending { it.length }
    var count = 0;

    var r = br.readLine()
    for(str in list){
        while (r.contains(str)) {
            r = r.replaceFirst(str, "*")
            count++
        }
    }

    for(ch in r){
        if(ch != '*') count++
    }
    println(count)
}
