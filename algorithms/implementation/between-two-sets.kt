import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = IntArray(n)
    for (a_i in 0 until n) {
        a[a_i] = sc.nextInt()
    }
    val b = IntArray(m)
    for (b_i in 0 until m) {
        b[b_i] = sc.nextInt()
    }
    print(getTotal(a, b))
    sc.close()
}

fun getTotal(a: IntArray, b: IntArray) : Int {
    val xB: ArrayList<Int> = ArrayList()
    for (number in b) {
        (1 until number + 1).filterTo(xB) { number % it == 0 }
    }
    val xBFiltered = xB.distinct()
    var possible = true
    var result = 0
    for (x in xBFiltered) {
        if (Collections.frequency(xB, x) == b.size) {
            for (number in a) {
                if (x % number != 0) {
                    possible = false
                    break
                }
            }
            if (possible) {
                result++
            }
            possible = true
        }
    }
    return result
}
