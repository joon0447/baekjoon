import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine().split(" ")
    val n = BigInteger(str[0])
    val m = BigInteger(str[1])

    println((n-m).abs())

}