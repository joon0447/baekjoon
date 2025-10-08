import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var str = br.readLine()
    val answer = StringBuilder()
    while(!str.equals("# 0 0")){
        val arr = str.split(" ")
        val name = arr[0]
        val age = arr[1].toInt()
        val weight = arr[2].toInt()
        var grade = "Junior"
        if(age > 17 || weight >=80) grade = "Senior"

        answer.append("$name $grade\n")
        str = br.readLine()
    }

    println(answer)
}
