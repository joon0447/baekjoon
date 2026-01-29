fun main() {
    val n = readln().toInt()
    var answer = 1
    var start = 1
    var end = 2

    while (start < end) {
        var sum = 0
        for (i in start..end) {
            sum += i
        }
        if (sum == n) answer ++
        if (sum > n) start ++
        else end++
    }

    println(answer)
}