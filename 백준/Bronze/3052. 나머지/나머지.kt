import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val set = HashSet<Int>()
    for(i in 1..10){
        val num = br.readLine().toInt() % 42
        set.add(num)
    }

    println(set.size)
}
