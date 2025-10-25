import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(br.readLine().toInt())
    }
    list.sortDescending()

    var price = k
    var answer = 0
    for (num in list) {
        if(num > price) continue
        if(price == 0) break
        answer += price/num
        price %= num
    }
    println(answer)
}
