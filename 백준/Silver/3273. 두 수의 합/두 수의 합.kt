import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val numbers = StringTokenizer(br.readLine())
    val x = br.readLine().toInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = numbers.nextToken().toInt()
    }
    val sorted = arr.sorted()

    var answer = 0
    var left = 0
    var right = sorted.size - 1

    while(left < right) {
        val sum = sorted[left] + sorted[right]
        if(sum == x) {
            answer++
            right--
        } 
        else if(sum > x) right--
        else left++
    }

    println(answer)
}

