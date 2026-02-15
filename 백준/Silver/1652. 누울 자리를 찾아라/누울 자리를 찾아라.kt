import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val rowArr = Array(n) { "" }
    val colArr = Array(n) { "" }

    for (i in 0 until n) {
        rowArr[i] = br.readLine()
    }

    for (i in 0 until n) {
        colArr[i] = rowArr.map { it[i] }.joinToString("")
    }

    var row = 0
    var col = 0

    for (i in 0 until n) {
        val rowSplit = rowArr[i].split("X")
        row += rowSplit.count { it.length >= 2}

        val colSplit = colArr[i].split("X")
        col += colSplit.count { it.length >= 2}
    }

    println("$row $col")
}