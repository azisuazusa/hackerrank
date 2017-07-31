import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val m = scan.nextInt()
    val coins = Array(m, {0})
    var i = 0
    while (i < m) {
        coins[i] = scan.nextInt()
        i++
    }
    println(solutions(coins, n))
}

fun solutions(coins: Array<Int>, n: Int) : Long {
    val numCoins = Array(n + 1, {0L})
    numCoins[0] = 1
    var j: Int
    for (index in coins.indices) {
        j = coins[index]
        while (j < numCoins.size) {
            numCoins[j] += numCoins[j - coins[index]]
            j++
        }
    }
    return numCoins[n]
}
