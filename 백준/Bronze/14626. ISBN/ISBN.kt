import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()
    val index = str.indexOf('*')
    var total = 0
    for(i in 0 until str.length) {
        if(i == index) continue
        if(i%2==0) {
            total += str[i].digitToInt()
        } else {
            total += 3 * str[i].digitToInt()
        }
    }
    var mult = 1
    if(index%2 !=0) {
        mult = 3
    }


    for(i in 0..9) {
        if((total + i*mult) % 10 == 0){
            println(i)
            return
        }
    }
}


