fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }.toSet().sorted()
    for(i in list) {
        print("$i ")
    }
}
