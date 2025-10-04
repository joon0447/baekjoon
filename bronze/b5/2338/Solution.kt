import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = BigInteger(br.readLine())
    val b = BigInteger(br.readLine())

    println(a+b)
    println(a-b)
    println(a*b)

}