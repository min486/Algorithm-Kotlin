fun main() {
    val left = ArrayDeque<Char>()
    val right = ArrayDeque<Char>()

    val st = readLine()!!
    for (ch in st) {
        left.addLast(ch)
    }

    val m = readLine()!!.toInt()
    for (i in 0 until m) {
        val line = readLine()!!

        when {
            line == "L" -> {
                if (left.isNotEmpty()) right.addLast(left.removeLast())
            }
            line == "D" -> {
                if (right.isNotEmpty()) left.addLast(right.removeLast())
            }
            line == "B" -> {
                if (left.isNotEmpty()) left.removeLast()
            }
            line.startsWith("P") -> {
                val x = line.split(" ")[1][0]
                left.addLast(x)
            }
        }
    }

    // var ans = ""
    // for (ch in left) {
    //     ans += ch
    // }
    // for (ch in right.reversed()) {
    //     ans += ch
    // }

    val ans = StringBuilder()
    for (ch in left) {
        ans.append(ch)
    }
    for (ch in right.reversed()) {
        ans.append(ch)
    }

    println(ans)
}