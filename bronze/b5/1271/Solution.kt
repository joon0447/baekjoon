import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = br.readLine()
    val sp = line.split(" ")
    val n = BigInteger(sp[0])
    val m = BigInteger(sp[1])

    println(n/m)
    println(n%m)
}
