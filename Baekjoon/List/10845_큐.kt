fun main() {
    val n = readLine()!!.toInt()
    val q = ArrayDeque<Int>()

    for (i in 0 until n) {
        val li = readLine()!!.split(" ")

        if (li[0] == "push") {
            q.addLast(li[1].toInt())
        } else if (li[0] == "pop") {
            if (q.isEmpty()) {
                println(-1)
            } else {
                println(q.removeFirst())
            }
        } else if (li[0] == "size") {
            println(q.size)
        } else if (li[0] == "empty") {
            if (q.isEmpty()) {
                println(1)
            } else {
                println(0)
            }
        } else if (li[0] == "front") {
            if (q.isEmpty()) {
                println(-1)
            } else {
                println(q.first())
            }
        } else if (li[0] == "back") {
            if (q.isEmpty()) {
                println(-1) 
            } else {
                println(q.last())
            }
        }
    }
}