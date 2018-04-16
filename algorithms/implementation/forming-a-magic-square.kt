import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val preMatrix = arrayOf(
            arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
            arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)),
            arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
            arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)),
            arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
            arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
            arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
            arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8))
    )
    val matrix = Array(3, {IntArray(3)})
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            matrix[i][j] = sc.nextInt()
        }
    }
    print(resolve(preMatrix, matrix))
}

fun resolve(preMatrix: Array<Array<IntArray>>, matrix: Array<IntArray>) : Int {
    val totals = ArrayList<Int>()
    for (iPreMatrix in 0 until preMatrix.size) {
        var total = 0
        for (iPreRow in 0 until preMatrix[iPreMatrix].size) {
            for (i in 0 until preMatrix[iPreMatrix][iPreRow].size) {
                val iPre = preMatrix[iPreMatrix][iPreRow][i]
                val iMatrix = matrix[iPreRow][i]
                if (iPre != iMatrix) {
                    total += maxOf(iPre, iMatrix) - minOf(iPre, iMatrix)
                }
            }
        }
        totals.add(total)
    }
    return totals.min()!!
}

