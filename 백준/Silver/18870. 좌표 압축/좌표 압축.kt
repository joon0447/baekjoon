import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    val sortedArr = arr.sorted().toSet()
    val map = mutableMapOf<Int, Int>()

    sortedArr.forEachIndexed { index, value ->
        map[value] = index
    }

    val answer = StringBuilder()
    arr.forEach {
        answer.append(map[it]).append(" ")
    }

    println(answer.toString())
}
