
var fibCount = 0
var dpCount = 0
fun main() {
    val n = readLine()!!.toInt()
    fib(n)
    fibonacci(n)
    println("$fibCount $dpCount")
}

fun fib(n: Int) {
    if(n==1 || n==2){
        fibCount++
    }
    else {
        fib(n-1)
        fib(n-2)
    }
}

fun fibonacci(n: Int) {
    for(i in 2..<n) {
        dpCount++
    }
}