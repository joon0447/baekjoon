import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val map = mutableMapOf<Char, Int>()

    val number = br.readLine().replace("6", "9")
    for(char in number){
        map.put(char, map.getOrDefault(char, 0)+1)
    }
    val num = map.getOrDefault('9', 0)
    var value = 0
    if(num%2==0) value = num/2
    else value = num/2+1
    map['9'] = value
    val max = map.values.maxOrNull()
    println(max)
}
