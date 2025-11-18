import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while(true){
        val str = br.readLine()
        if(str == "0") return

        val reverse = str.reversed()
        if(reverse.toInt() == str.toInt()) println("yes")
        else println("no")
    }
}
