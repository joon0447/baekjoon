import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    val str = hashSetOf<String>()
    repeat(n) {
        str.add(br.readLine())
    }

    str.toMutableList().apply {
        sortWith { d1, d2 ->
            if(d1.length == d2.length){
                d1.compareTo(d2)
            } else{
                d1.length - d2.length
            }
        }

        this.forEach {
            sb.append(it).append('\n')
        }
    }

    println(sb.toString())
}