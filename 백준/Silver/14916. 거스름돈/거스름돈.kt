
fun main() {
    val n = readLine()!!.toInt()

    var answer = -1
    for (five in n / 5 downTo 0) {
        val remain = n - 5 * five
        if (remain % 2 == 0) {
            val two = remain / 2
            answer = five + two
            break 
        }
    }

    println(answer)
}