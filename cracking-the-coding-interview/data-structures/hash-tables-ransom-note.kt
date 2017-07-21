/**
 * Created by azisuazusa on 7/20/17.
 */
fun main(args: Array<String>) {
    readLine()!!.split(' ')
    print(ransomNote(readLine()!!, readLine()!!))
}

fun ransomNote(magazine: String, ransom: String) : String {
    val magazineMap: HashMap<String, Int> = HashMap()
    for (word in magazine.split(" ")) {
        if (magazineMap.containsKey(word)) {
            val count = magazineMap[word]!! + 1
            magazineMap.put(word, count)
        } else {
            magazineMap.put(word, 1)
        }
    }

    val ransomMap: HashMap<String, Int> = HashMap()

    for (word in ransom.split(" ")) {
        if (ransomMap.containsKey(word)) {
            val count = ransomMap[word]!! + 1
            ransomMap.put(word, count)
        } else {
            ransomMap.put(word, 1)
        }
    }

    val iterator = ransomMap.entries.iterator()
    while (iterator.hasNext()) {
        val pair: Map.Entry<String, Int> = iterator.next()
        val word = pair.key
        val count: Int = pair.value
        if (!magazineMap.containsKey(word)) {
            return "No"
        } else {
            if (count > magazineMap[word]!!) {
                return "No"
            }
        }
    }
    return "Yes"
}
