fun main() {
    val (n,k) = readln().split(" ").map { it.toInt() }

    val arr = Array(n) {
        val (number, gold, silver, bronze) = readln().split(" ").map { it.toInt() }
        Rank(number, gold, silver, bronze)
    }

    val sortedRanks = arr.sortedWith(
        compareByDescending<Rank> { it.gold }
            .thenByDescending { it.silver }
            .thenByDescending { it.bronze }
    )
    var answer = 1
    val target = arr.find { it.number == k }!!
    for(rank in sortedRanks) {
        if (rank.gold > target.gold) {
            answer++
        } else if(rank.gold == target.gold &&
            rank.silver > target.silver) {
            answer++
        } else if(rank.gold == target.gold &&
            rank.silver == target.silver &&
            rank.bronze > target.bronze) {
            answer++
        }
    }

    println(answer)
}

data class Rank(
    val number: Int,
    val gold: Int,
    val silver: Int,
    val bronze: Int
)