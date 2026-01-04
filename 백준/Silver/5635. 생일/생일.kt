fun main() {
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, Triple<Int,Int,Int>>()

    repeat(n) {
        val line = readLine()!!.split(" ")
        map[line[0]] = Triple(line[3].toInt(), line[2].toInt(), line[1].toInt())
    }

    val sortedMap = map.toList()
        .sortedWith(compareBy (
            {it.second.first},
            {it.second.second},
            {it.second.third}
        ))

    println(sortedMap.last().first)
    println(sortedMap.first().first)
}
