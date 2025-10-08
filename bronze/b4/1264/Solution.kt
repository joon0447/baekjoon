import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    var str = br.readLine()
    val answer = StringBuilder()
    while(!str.equals("#")) {
        var count = 0
        for (char in str) {
            if (arr.contains(char.lowercaseChar())) count++
        }
        answer.append(count)
        answer.append("\n")
        str = br.readLine()
    }
    println(answer.toString())
}
