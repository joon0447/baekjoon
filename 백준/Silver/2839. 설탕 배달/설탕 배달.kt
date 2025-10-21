import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var count_5 = n / 5

    while(count_5 >= 0){
        val remain = n - 5 * count_5
        if(remain %3 ==0) {
            println(count_5 + remain / 3)
            return;
        } else{
            count_5--
        }
    }

    println(-1)
}
