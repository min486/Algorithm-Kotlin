fun main() {
    for (i in 0 until 3) {
        val li = readLine()!!.split(" ").map { it.toInt() }
        val cnt = li.count { it == 0 }
        
        val ans = when(cnt) {
            0 -> "E"
            1 -> "A"
            2 -> "B"
            3 -> "C"
            4 -> "D"
            else -> ""
        }
        
        println(ans)
    }
}