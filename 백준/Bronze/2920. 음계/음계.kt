import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val list = br.readLine().split(" ")

    var ascending = false
    var descending = false

    for(i in 0 until list.size-1) {
        if(list[i] < list[i+1]) ascending = true
        else if(list[i] > list[i+1]) descending = true
    }

    if(ascending && !descending) println("ascending")
    else if(!ascending && descending) println("descending")
    else println("mixed")
}
