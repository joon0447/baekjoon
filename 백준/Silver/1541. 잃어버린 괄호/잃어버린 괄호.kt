
fun main() {
    val line = readLine()!!
    if(!line.contains("-")){
        val answer = line.split("+").sumOf { it.toInt() }
        println(answer)
    } else {
        val split = line.split("-")
        var answer = split.first().split("+").sumOf { it.toInt() }

        var second = 0
        for(i in 1..<split.size) {
            second += split[i].split("+").sumOf { it.toInt() }
        }
        println(answer-second)
    }
}