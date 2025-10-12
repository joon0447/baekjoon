import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()
    for(i in 1..3){
        val n = br.readLine().toInt()
        var sum = BigInteger.ZERO
        for(j in 1..n){
            sum = sum.add(br.readLine().toBigInteger())
        }
        if(sum == BigInteger.ZERO){
            answer.append("${0}\n")
        }
        else if(sum > BigInteger.ZERO){
            answer.append("+\n")
        }else{
            answer.append("-\n")
        }
    }

    println(answer.toString())
}
