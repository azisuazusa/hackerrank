/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>, n: Int): Int {
    a.sort()
    var count = 0
    var max = 0
    for (i in 0 until n) {
        for (j in i until n) if (a[j] - a[i] <= 1) count++
        if (count > max) max = count
        count = 0
    }
    return max
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = pickingNumbers(a, n)
    println(result)
}

