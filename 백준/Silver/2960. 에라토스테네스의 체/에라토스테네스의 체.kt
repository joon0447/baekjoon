import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,k) = br.readLine().split(" ").map{it.toInt()}

    val removed = BooleanArray(n+1)
    var count = 0

    for (i in 2..n){
        if(!removed[i]){
            for(j in i..n step i){
                if(!removed[j]) {
                    removed[j] = true
                    count++
                    if(count == k){
                        println(j)
                        return
                    }
                }
            }
        }
    }
}
