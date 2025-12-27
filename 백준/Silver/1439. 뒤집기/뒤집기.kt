import kotlin.math.min

fun main() {
    val s = readLine()!!
    val list = mutableListOf<String>()

    var last = s.first()
    var str = ""
    for(ch in s) {
        if(ch == last) str += ch
        else {
            list.add(str)
            last = ch
            str = "" + ch
        }
    }
    if(str.isNotEmpty()) {
        list.add(str)
    }

    val zero = list.filter { it.contains("0") }
    val one = list.filter { it.contains("1") }
    println(min(zero.size, one.size))
}
