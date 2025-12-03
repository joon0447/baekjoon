import java.math.BigInteger

fun main() {
    val n = readLine()!!.toInt()

    if(n==0) {
        println(0)
        return
    }

    var a = BigInteger.ZERO
    var b = BigInteger.ONE

    for(i in 2..n) {
        val next = a+b
        a = b
        b = next
    }

    println(b)
}