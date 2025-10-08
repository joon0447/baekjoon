import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val year = br.readLine().toInt()

    if(((year%4==0) && (year%100 != 0)) || year%400 == 0) println(1)
    else println(0)

}
