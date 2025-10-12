import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b) = br.readLine().split(" ").map {it.toInt()}

    val rowA = (a-1)/4
    val colA = (a-1)%4

    val rowB = (b-1)/4
    val colB = (b-1)%4

    val answer = abs(rowA - rowB) + abs(colA - colB)
    println(answer)
}
