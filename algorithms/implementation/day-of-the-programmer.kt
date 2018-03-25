import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()
    print(resolve(year))
}

fun resolve(year: Int) : String {
    if (year == 1918) return "26.09.1918"
    if (isLeap(year)) return "12.09." + year
    return "13.09." + year
}

fun isLeap(year: Int) : Boolean {
    if (year % 4 != 0) return false
    if (year > 1918 && year % 100 == 0 && year % 400 != 0) return false
    return true
}
