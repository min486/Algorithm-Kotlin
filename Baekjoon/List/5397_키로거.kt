fun main() { 
    val tc = readLine()!!.toInt()

    for (i in 0 until tc) {
        val left = ArrayDeque<Char>()
        val right = ArrayDeque<Char>()

        val st = readLine()!!

        for (ch in st) {
            when (ch) {
                '<' -> {
                    if (left.isNotEmpty()) right.addLast(left.removeLast())
                }
                '>' -> {
                    if (right.isNotEmpty()) left.addLast(right.removeLast())
                }
                '-' -> {
                    if (left.isNotEmpty()) left.removeLast()
                }
                else -> {
                    left.addLast(ch)
                }
            }
        }

        val ans = StringBuilder()
        
        for (ch in left) {
            ans.append(ch)
        }
        for (ch in right.reversed()) {
            ans.append(ch)
        }

        println(ans)
    }
}