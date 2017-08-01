import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    scan.nextLine()
    val node = Node()
    for (i in 0 until n) {
        val string = scan.nextLine().split(" ")
        if (string[0] == "add") {
            node.add(string[1], 0)
        } else {
            println(node.findCount(string[1], 0))
        }
    }
}

class Node {
    val children = arrayOfNulls<Node>(26)
    var size = 0

    fun getCharIndex(char: Char) : Int = char - 'a'
    fun getNode(char: Char) : Node? = children[getCharIndex(char)]

    fun setNode(char: Char, node: Node) {
        children[getCharIndex(char)] = node
    }

    fun add(string: String, index: Int) {
        size++
        if (index == string.length) return
        val current: Char = string[index]
        var child: Node? = getNode(current)
        if (child == null) {
            child = Node()
            setNode(current, child)
        }
        child.add(string, index + 1)
    }

    fun findCount(string: String, index: Int) : Int {
        if (index == string.length) return size
        val child: Node = getNode(string[index]) ?: return 0
        return child.findCount(string, index + 1)
    }
}
