import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()
    val vowel = listOf('a', 'e', 'i', 'o', 'u')

    while (true) {
        val line = br.readLine()
        if (line == "end") {
            println(answer.toString())
            return
        }

        if (line.count { vowel.contains(it) } > 0) {
            if(isValidPassword(line)) answer.append("<$line> is acceptable.\n")
            else answer.append("<$line> is not acceptable.\n")
        } else {
            answer.append("<$line> is not acceptable.\n")
        }
    }
}

fun isValidPassword(s: String): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var vowelCnt = 0
    var noVowelCnt = 0

    for (i in s.indices) {
        val c = s[i]
        if (c in vowels) {
            vowelCnt++
            noVowelCnt = 0
        } else {
            noVowelCnt++
            vowelCnt = 0
        }

        if(vowelCnt >= 3 || noVowelCnt >= 3) {
            return false
        }

        if (i > 0 && s[i] == s[i-1]) {
            if (c != 'e' && c != 'o') return false
        }
    }

    return true
}