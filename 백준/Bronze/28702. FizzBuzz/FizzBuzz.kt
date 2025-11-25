fun main() {
    val s = Array(3) { readLine()!!.trim() }

    fun isNumber(str: String): Boolean = str.all { it.isDigit() }

    val idx = s.indexOfFirst { isNumber(it) }
    val num = s[idx].toInt()

    val start = num - idx

    val next = start + 3

    val answer = when {
        next % 15 == 0 -> "FizzBuzz"
        next % 3 == 0 -> "Fizz"
        next % 5 == 0 -> "Buzz"
        else -> next.toString()
    }

    println(answer)
}