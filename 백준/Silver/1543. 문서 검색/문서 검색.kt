fun main() {
    val doc = readLine()!!
    val word = readLine()!!
    var answer = 0
    var start = 0

    while (start + word.length <= doc.length) {
        val split = doc.substring(start, start + word.length)
        if(split == word) {
            answer ++
            start += word.length
        } else {
            start++
        }
    }

    println(answer)
}
