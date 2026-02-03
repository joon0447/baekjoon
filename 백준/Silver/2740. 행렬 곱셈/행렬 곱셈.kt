import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    // 1. 행렬 A 입력 (N * M)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val matrixA = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrixA[i][j] = sc.nextInt()
        }
    }

    // 2. 행렬 B 입력 (M * K)
    val m2 = sc.nextInt() // 문제에서 주어진 M과 동일함
    val k = sc.nextInt()
    val matrixB = Array(m2) { IntArray(k) }
    for (i in 0 until m2) {
        for (j in 0 until k) {
            matrixB[i][j] = sc.nextInt()
        }
    }

    // 3. 행렬 곱셈 수행 (결과 크기: N * K)
    val result = Array(n) { IntArray(k) }

    for (i in 0 until n) {
        for (j in 0 until k) {
            var sum = 0
            for (l in 0 until m) {
                sum += matrixA[i][l] * matrixB[l][j]
            }
            result[i][j] = sum
        }
    }

    // 4. 결과 출력
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until k) {
            sb.append(result[i][j]).append(" ")
        }
        sb.append("\n")
    }
    print(sb)
}