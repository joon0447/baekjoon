fun main() {
    val list = mutableListOf<Int>()
    repeat(8) {
        val line = readLine()!!.toInt()
        list.add(line)
    }
    val copyList = mutableListOf<Int>()
    copyList.addAll(list)
    list.sortDescending()
    var sum = 0
    val turn = mutableListOf<Int>()
    for(i in 0..4) {
        sum += list[i]
        val index = copyList.indexOf(list[i])
        turn.add(index+1)
    }
    println(sum)
    turn.sort()
    for(i in turn) {
        print("$i ")
    }

}
