import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = IntArray(n)
    for (i in 0 until n) {
        s[i] = sc.nextInt()
    }
    val d = sc.nextInt()
    val m = sc.nextInt()
    print(resolve(s, d, m))
    sc.close()
}

fun resolve(s: IntArray, d: Int, m: Int) : Int {
    var result = 0
    for (i in 0 until s.size) {
        var sum = s[i]
        for (j in i + 1 until m + i) if (m + i > s.size) break else sum += s[j]
        if (sum == d) result++
    }
    return result
}
