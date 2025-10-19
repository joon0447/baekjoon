
fun main() {
    val arr = BooleanArray(10001){true}

    val sb = StringBuilder()

    for(i in 1..10000){
        val num =  d(i)
        if(num <= 10000) arr[num] = false
    }

    for(i in 1..10000){
        if(arr[i]) sb.append(i).append("\n")
    }

    println(sb.toString())
}

fun d(n: Int): Int {
    var num = n
    var sum = n
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}
