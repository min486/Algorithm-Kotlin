fun main() {
    val li = listOf(1, 2, 2, 3)
    println(li.count())  // 4
    println(li.count { it == 2 })  // 2
    println(li.count(2))  // x
}