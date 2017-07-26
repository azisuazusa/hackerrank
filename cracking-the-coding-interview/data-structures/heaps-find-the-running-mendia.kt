import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val lowers = PriorityQueue<Int>(kotlin.Comparator.reverseOrder())
    val highers = PriorityQueue<Int>()
    val n = scan.nextInt()
    var i = 0
    while (i < n) {
        val ai = scan.nextInt()
        if (!lowers.isEmpty() && ai <= lowers.peek()) {
            lowers.offer(ai)
        } else {
            highers.offer(ai)
        }
        while (lowers.size > highers.size) {
            highers.offer(lowers.poll())
        }
        while (highers.size - lowers.size > 1) {
            lowers.offer(highers.poll())
        }
        var median: Double
        if (lowers.size == highers.size) {
            median = (lowers.peek() + highers.peek()) / 2.0
        } else {
            median = highers.peek().toDouble()
        }
        println(median)
        i++
    }
    scan.close()
}
