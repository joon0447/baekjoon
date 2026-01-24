fun main() {
    val word = readln()
    val length = word.length
    val results = mutableListOf<String>()

    for(i in 1 until length - 1) {
        for(j in i+1 until length) {
            val part1 = word.substring(0,i).reversed()
            val part2 = word.substring(i,j).reversed()
            val part3 = word.substring(j, length).reversed()
            results.add(part1 + part2 + part3)
        }
    }

    results.sort()
    println(results.first())
}