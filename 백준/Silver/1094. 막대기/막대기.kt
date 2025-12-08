fun main() {
    val x = readLine()!!.toInt()
    var total = 64
    val list = mutableListOf<Int>()
    list.add(64)

    while(total>x) {
        val min = list.min()
        list.remove(min)

        val half = min/2

        if(total-min + half >= x) {
            list.add(half)
            total = total -min + half
        } else {
            list.add(half)
            list.add(half)
            total = total - min + half + half
        }
    }

    println(list.size)

}