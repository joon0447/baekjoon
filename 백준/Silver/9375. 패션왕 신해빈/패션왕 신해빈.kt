fun main() {
    val case = readLine()!!.toInt()

    repeat(case) {
        val n = readLine()!!.toInt()
        val map = mutableMapOf<String, Int>()

        repeat(n) {
            val str = readLine()!!.split(" ")
            map[str[1]] = map.getOrDefault(str[1],0) + 1
        }

        var result = 1
        for (cnt in map.values) {
            result *= (cnt + 1)
        }
        result -= 1

        println(result)
    }
}