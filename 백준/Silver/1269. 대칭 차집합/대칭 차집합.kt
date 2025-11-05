import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b) = br.readLine().trim().split(" ")
    val aSet = br.readLine().split(" ").toSet()
    val bSet = br.readLine().split(" ").toSet()

    val aFilter = aSet.filter { !bSet.contains(it)}
    val bFilter = bSet.filter { !aSet.contains(it)}

    println(aFilter.size + bFilter.size)
}
