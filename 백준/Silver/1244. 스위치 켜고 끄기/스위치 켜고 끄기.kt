import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it == "1" }.toMutableList()
    val students = br.readLine().toInt()

    repeat(students) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        if (a == 1) {
            for (i in b - 1 until n step b) {
                array[i] = !array[i]
            }
        } else {
            var left = b - 1
            var right = b - 1
            
            while (left - 1 >= 0 && right + 1 < n && array[left - 1] == array[right + 1]) {
                left--
                right++
            }
            
            for (i in left..right) {
                array[i] = !array[i]
            }
        }
    }

    for (i in array.indices) {
        print(if (array[i]) "1 " else "0 ")
        if ((i + 1) % 20 == 0) println()
    }

}
