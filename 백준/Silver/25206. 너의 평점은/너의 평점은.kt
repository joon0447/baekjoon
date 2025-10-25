import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val scoreMap = mutableMapOf<String, Double>()

    scoreMap["A+"] = 4.5
    scoreMap["A0"] = 4.0
    scoreMap["B+"] = 3.5
    scoreMap["B0"] = 3.0
    scoreMap["C+"] = 2.5
    scoreMap["C0"] = 2.0
    scoreMap["D+"] = 1.5
    scoreMap["D0"] = 1.0
    scoreMap["F"] = 0.0

    var totalScore = 0.0
    var total = 0.0
    repeat(20) {
        val(name, score, grade) = br.readLine().split(" ")
        if(grade == "P") return@repeat
        totalScore += score.toDouble()
        total += score.toDouble() * scoreMap.getOrDefault(grade, 0.0)
    }

    println(total / totalScore)
}
