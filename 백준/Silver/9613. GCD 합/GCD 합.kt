fun main() {
    val t = readLine()!!.toInt()
    val answer = StringBuilder()

    repeat(t) {
        val line = readLine()!!.split(" ").map { it.toInt() }
        var sum = 0L
        for(i in 1 until line.size) {
            for (j in i+1 until line.size) {
                sum += gcd(line[i], line[j])
            }
        }

        answer.append(sum)
        answer.append("\n")
    }

    println(answer.toString())
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}