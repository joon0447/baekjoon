import kotlin.math.min

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    var minPackage = Int.MAX_VALUE
    var minOne = Int.MAX_VALUE
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        minPackage = min(minPackage, a)
        minOne = min(minOne, b)
    }

    // 패키지로만 살 때
    val packCount = if(n%6==0) n/6 else n/6+1
    val packPrice = packCount * minPackage
    // 패키지 + 낱개
    val mixPrice = n/6 * minPackage + n%6  * minOne

    // 낱개로만 살때
    val onePrice = n * minOne

    println(minOf(packPrice, onePrice, mixPrice))
}