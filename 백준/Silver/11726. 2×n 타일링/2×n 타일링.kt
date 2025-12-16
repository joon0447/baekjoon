fun main() {
    val n = readLine()!!.toInt()

    val arr = IntArray(n+1)
    arr[1] = 1
    if (n >= 2) arr[2] = 2
    
    for (i in 3..n) {
        arr[i] = (arr[i-1] + arr[i-2]) % 10007
    }

    println(arr[n])
}