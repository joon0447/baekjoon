fun main() {
    val (e, s, m) = readLine()!!.split(" ").map { it.toInt() }

    var E = 1
    var S = 1
    var M = 1
    var answer = 1

    while(true) {
        if(e == E && s == S && m == M) break

        E++
        S++
        M++
        answer++
        if(E > 15) E = 1
        if(S > 28) S = 1
        if(M > 19) M = 1
    }

    println(answer)

}