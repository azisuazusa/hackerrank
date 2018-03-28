import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numberOfSteps = sc.nextInt()
    val steps = sc.next()
    print(resolve(numberOfSteps, steps))
}

fun resolve(numberOfPages: Int, steps: String) : Int {
    var valleyIndicator = 0
    var stillInValley = false
    var valley = 0
    for (i in 0 until numberOfPages) {
        if (steps[i] == 'U') valleyIndicator++ else valleyIndicator--
        if (valleyIndicator < 0 && !stillInValley) {
            valley++
            stillInValley = true
        }
        if (valleyIndicator >= 0 && stillInValley) stillInValley = false
    }
    return valley
}

