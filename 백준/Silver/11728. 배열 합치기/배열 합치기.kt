import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val str1 = StringTokenizer(br.readLine())
    val n = str1.nextToken().toInt()
    val m = str1.nextToken().toInt()

    val a = IntArray(n)
    val b = IntArray(m)

    val stA = StringTokenizer(br.readLine())
    for (i in 0 until n) a[i] = stA.nextToken().toInt()

    val stB = StringTokenizer(br.readLine())
    for (i in 0 until m) b[i] = stB.nextToken().toInt()

    val sb = StringBuilder()
    var p1 = 0
    var p2 = 0

    while (p1 < n && p2 < m) {
        if(a[p1] <= b[p2]) {
            sb.append(a[p1++]).append(" ")
        } else {
            sb.append(b[p2++]).append(" ")
        }
    }

    while (p1 < n) sb.append(a[p1++]).append(" ")
    while (p2 < m) sb.append(b[p2++]).append(" ")


    println(sb.toString())
}
