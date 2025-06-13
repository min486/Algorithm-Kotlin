fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val a = mutableSetOf<String>()
    for (i in 0 until n) {
        a.add(readLine()!!)
    }
    val b = mutableSetOf<String>()
    for (i in 0 until m) {
        b.add(readLine()!!)
    }

    val ab = a intersect b
    val li = ab.sorted()

    println(li.size)
    for (i in li) {
        println(i)
    }
}