fun main() {
    // val li = mutableListOf(1, 2, 3, 4, 5)
    val li = listOf(1, 2, 3, 4, 5)
    val ans = li.filter { it % 2 == 0 }
    println(ans)
}