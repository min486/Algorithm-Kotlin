fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val q = ArrayDeque<Int>()
    val ans = mutableListOf<Int>()

    for (i in 1..n) {
        q.addLast(i)
    }

    var cnt = 0
    while (q.size != 0) {
        cnt++

        if (cnt % k == 0) {
            ans.add(q.removeFirst())
        } else {
            q.addLast(q.removeFirst())
        }
    }

    println("<${ans.joinToString(", ")}>")
}