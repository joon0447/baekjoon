import java.io.BufferedReader
import java.io.InputStreamReader

data class Student(val name: String, val kr: Int, val eng: Int, val math: Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val students = mutableListOf<Student>()

    repeat(n) {
        val(name, kr, eng, math) = br.readLine().split(" ")
        students.add(Student(name, kr.toInt(), eng.toInt(), math.toInt()))
    }

    val sorted = students.sortedWith(
        compareByDescending<Student> {it.kr}
            .thenBy { it.eng }
            .thenByDescending { it.math }
            .thenBy { it.name }
    )

    val answer = StringBuilder()
    sorted.forEach {
        answer.append("${it.name}\n")
    }

    println(answer.toString())
}
