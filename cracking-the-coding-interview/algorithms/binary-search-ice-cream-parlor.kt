import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    var i = 0
    while (i < n) {
        val money = scan.nextInt()
        val menuLength = scan.nextInt()
        val menu = Array(menuLength, {0})
        var j = 0
        while (j < menuLength) {
            menu[j] = scan.nextInt()
            j++
        }
        val result = findChoices(menu, money)
        println(result!![0].toString() + " " + result[1].toString())
        i++
    }
    scan.close()
}

fun findChoices(menu: Array<Int>, money: Int) : Array<Int>? {
    val sortedMenu = menu.clone().sortedArray()
    for (index in sortedMenu.indices) {
        val complement = money - sortedMenu[index]
        val location = sortedMenu.binarySearch(complement)
        if (location >= 0 && location < menu.size && sortedMenu[location] == complement) {
            val res1 = Math.min(menu.indexOf(sortedMenu[index]), menu.indexOf(complement))
            menu[res1] = 0
            val res2 = Math.max(menu.indexOf(sortedMenu[index]), menu.indexOf(complement))
            return arrayOf(
                    res1 + 1,
                    res2 + 1
            )
        }
    }
    return null
}
