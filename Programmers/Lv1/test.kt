fun main() {
    val a = listOf(5, 3, 7)
    val ans = a.minOf { it * 2 }
    println(ans)

    println(minOf(3, 10))
    println(minOf("a", "b", "c"))
}
