
fun main() {
    val case = readLine()!!.toInt()
    val arr = LongArray(101)
    arr[1] = 1
    arr[2] = 1
    arr[3] = 1

    for(i in 4..100) {
        arr[i] = arr[i - 2] + arr[i - 3]
    }

    repeat(case) {
        val index = readLine()!!.toInt()
        println(arr[index])
    }
}