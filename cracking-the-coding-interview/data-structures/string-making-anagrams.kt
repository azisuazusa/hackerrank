import java.lang.Math.abs

/**
 * Created by azisuazusa on 7/20/17.
 */
fun main(args: Array<String>) {
    print(numberNeeded(readLine()!!, readLine()!!))
}
fun numberNeeded(string1: String, string2: String) : Int {
    val letterArray1 = Array(26, {0})
    val letterArray2 = Array(26, {0})
    for(char in string1) {
        val index = char.toInt() % 97
        letterArray1[index]++
    }
    for(char in string2) {
        val index = char.toInt() % 97
        letterArray2[index]++
    }
    return letterArray1.indices.sumBy { abs(letterArray1[it] - letterArray2[it]) }
}
