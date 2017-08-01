import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var testcase = scan.nextInt()
    while (testcase-- > 0) {
        val n = scan.nextInt()
        val array = IntArray(n)
        for (i in 0..n - 1) {
            array[i] = scan.nextInt()
        }
        val ms = MergeSort()
        println(ms.mergeSort(array))
    }
    scan.close()
}

class MergeSort {
    private var swaps: Long = 0
    fun mergeSort(array: IntArray): Long {
        val helper = IntArray(array.size)
        mergeSort(array, helper, 0, array.size - 1)
        return swaps
    }

    fun mergeSort(array: IntArray, helper: IntArray, start: Int, end: Int) {
        if (start < end) {
            val mid = (start + end) / 2
            mergeSort(array, helper, start, mid)
            mergeSort(array, helper, mid + 1, end)
            merge(array, helper, start, mid, end)
        }
    }

    fun merge(array: IntArray, helper: IntArray, start: Int, mid: Int, end: Int) {
        for (i in start..end) {
            helper[i] = array[i]
        }

        var curr = start
        var left = start
        var right = mid + 1

        while (left <= mid && right <= end) {
            if (helper[left] <= helper[right]) {
                array[curr++] = helper[left++]
            } else {
                swaps += (mid + 1 - left).toLong()
                array[curr++] = helper[right++]
            }
        }

        while (left <= mid) {
            array[curr++] = helper[left++]
        }
    }
}
