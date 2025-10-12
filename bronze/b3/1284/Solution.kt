import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()

    while(true){
        val num = br.readLine()
        if(num.equals("0")) break
        var length = 1
        for (ch in num) {
            length += when (ch) {
                '0' -> 4
                '1' -> 2
                else -> 3
            }
            length += 1 // 숫자 사이 여백 1칸
        }
        answer.append("$length\n")
    }

    println(answer.toString())
}
