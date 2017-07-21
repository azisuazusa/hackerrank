import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val length = scan.nextInt()
    var i = 0
    while (i < length) {
        println(process(scan.nextInt()))
        i++
    }
}

fun process(number: Int) : Int {
    var prev1 = 1
    var prev2 = 1
    var prev3 = 0
    var i = 0
    while (i < number - 1) {
        val current = prev1 + prev2 + prev3
        prev3 = prev2
        prev2 = prev1
        prev1 = current
        i++
    }
    return prev1
}
