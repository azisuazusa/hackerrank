import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val money = sc.nextInt()
    val keyboards = IntArray(sc.nextInt())
    val usbDrives = IntArray(sc.nextInt())
    for (i in 0 until keyboards.size) keyboards[i] = sc.nextInt()
    for (i in 0 until usbDrives.size) usbDrives[i] = sc.nextInt()
    print(resolve(money, keyboards, usbDrives))
}

fun resolve(money: Int, keyboards: IntArray, usbDrives: IntArray) : Int {
    var highest = 0
    for (keyboard in keyboards) {
        usbDrives
                .asSequence()
                .map { keyboard + it }
                .filter { it in (highest + 1)..money }
                .forEach { highest = it }
    }
    return if (highest > 0) highest else -1
}

