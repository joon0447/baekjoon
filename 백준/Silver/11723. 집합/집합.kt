import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val set = mutableSetOf<Int>()
    val m = br.readLine().toInt()

    val answer = StringBuilder()
    repeat(m) {
        val arr = br.readLine().split(" ")
        when (arr[0]) {
            "add" -> set.add(arr[1].toInt())
            "remove" -> set.remove(arr[1].toInt())
            "check" ->
                if(set.contains(arr[1].toInt())) {
                    answer.append("1\n")
                } else answer.append("0\n")
            "toggle" ->
                if(set.contains(arr[1].toInt())) set.remove(arr[1].toInt())
                else set.add(arr[1].toInt())
            "all" -> {
                set.clear()
                for(i in 1..20) {
                    set.add(i)
                }
            }
            "empty" -> set.clear()
        }
    }

    println(answer.toString())
}
