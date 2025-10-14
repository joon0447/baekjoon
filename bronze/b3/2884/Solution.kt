import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (h,m) = br.readLine().split(" ").map {it.toInt()}
    val answer = StringBuilder()
    val sec = h*3600 + m*60 - 45*60

    var hour = sec / 3600
    var min = sec % 3600 / 60

    if(min<0) {
        min = 60 + min
        hour = 23
    }
    answer.append(hour);
    answer.append(" ");
    answer.append(min);

    println(answer.toString())

}
