fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val arr = Array(n) { IntArray(m) }
    for(i in 0..<n) {
        val line = readln().split(" ").map { it.toInt() }
        var index = 0
        for(j in 0..<m) {
            arr[i][j] = line[index++]
        }
    }
    val count = readln().toInt()
    repeat(count) {
        var total = 0
        val (i,j,x,y) = readln().split(" ").map { it.toInt()-1 }
        for(a in i..x) {
            for(b in j..y) {
                total += arr[a][b]
            }
        }
        println(total)
    }
}