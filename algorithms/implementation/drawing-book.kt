import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numberOfPages = sc.nextInt()
    val wantedPage = sc.nextInt()
    print(resolve(numberOfPages, wantedPage))
}

fun resolve(numberOfPages: Int, wantedPage: Int) : Int {
    val fromFront = wantedPage / 2
    val fromBack = (numberOfPages / 2) - (wantedPage / 2)
    return minOf(fromFront, fromBack)
}

