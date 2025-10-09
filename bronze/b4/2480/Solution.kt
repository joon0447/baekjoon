import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().split(" ")
    val set = HashSet<Int>()
    var max = 0
    var same = 0
    for(i in arr){
        if(set.contains(i.toInt())) same = i.toInt()
        else set.add(i.toInt())

        if(i.toInt() > max) max = i.toInt()
    }

    if(set.size == 3) println(max * 100)
    else if(set.size == 2) println(1000 + same * 100)
    else println(10000 + max * 1000)

}
