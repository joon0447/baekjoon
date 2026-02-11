fun main() {
    val str = readln()
    val filter = str.split(".").filter { it.isNotEmpty() }
    if (filter.count { it.length % 2 != 0 } > 0) {
        println(-1)
        return
    }
    val change = Array(filter.size) { "" }
    var index = 0
    for (s in filter) {
        var changeStr = ""
        if(s.length == 2) changeStr += "BB"
        else if(s.length == 4) changeStr +="AAAA"
        else {
            val aCount = s.length / 4
            val bCount = (s.length - (aCount * 4)) / 2
            repeat(aCount) {
                changeStr +="AAAA"
            }
            repeat(bCount) {
                changeStr += "BB"
            }
        }
        change[index] = changeStr
        index++
    }

    val answer = StringBuilder()
    var x = false
    var i = 0
    for(s in str) {
        if(s == 'X') {
            if(!x) {
                x = true
                answer.append(change[i])
                i++
            }
        } else {
            x = false
            answer.append(".")
        }
    }
    println(answer.toString())
}