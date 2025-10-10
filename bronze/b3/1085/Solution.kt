import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x,y,w,h) = br.readLine().split(" ").map {it.toInt()}

    val minY = min(h-y, y)
    val minX = min(w-x, x)

    println(min(minY, minX))
}