import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    var result = 0
    for (i in 0..a.size) {
        for (j in 1..a.size) {
            if (abs(a[i] - a[j]) < 2) {
                if (result == 0) result++
                if (a[j] - a[j + 1] < 2) result++
            } else {
                result--
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
