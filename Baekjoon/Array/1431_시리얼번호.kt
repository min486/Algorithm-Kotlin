fun main() {
    val n = readLine()!!.toInt()
    val li = List(n) { readLine()!! }

    val li_sort = li.sortedWith(
        compareBy(
            { it.length },
            { it.filter { ch -> ch.isDigit() }
                .sumOf { it.toString().toInt() } },
            { it }
        )
    )

    for (i in li_sort) {
        println(i)
    }
}