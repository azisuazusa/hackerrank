import java.util.Scanner

val R_OFFSETS = intArrayOf(-1, -1, 0, 1, 1, 1, 0, -1)
val C_OFFSETS = intArrayOf(0, 1, 1, 1, 0, -1, -1, -1)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val matrix = Array(n) { IntArray(m) }
    for (r in matrix.indices) {
        for (c in 0..matrix[0].size - 1) {
            matrix[r][c] = sc.nextInt()
        }
    }

    val visited = Array(n) { BooleanArray(m) }
    var maxRegion = 0
    for (r in matrix.indices) {
        (0..matrix[0].size - 1)
                .asSequence()
                .filter { !visited[r][it] && matrix[r][it] == 1 }
                .forEach { maxRegion = Math.max(maxRegion, countRegion(matrix, visited, r, it)) }
    }
    println(maxRegion)

    sc.close()
}

fun countRegion(matrix: Array<IntArray>, visited: Array<BooleanArray>, r: Int, c: Int): Int {
    val row = matrix.size
    val col = matrix[0].size

    if (!(r in 0..(row - 1) && c >= 0 && c < col) || !(matrix[r][c] == 1 && !visited[r][c])) {
        return 0
    }

    visited[r][c] = true

    val region = 1 + R_OFFSETS.indices.sumBy { countRegion(matrix, visited, r + R_OFFSETS[it], c + C_OFFSETS[it]) }
    return region
}
