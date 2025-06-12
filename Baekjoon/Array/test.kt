fun main() {
    val li = listOf(1, 2, 3)
    val arr = li.toTypedArray()
    val backToList = arr.toList()

    println(li::class)
    println(arr::class)
    println(backToList::class)
}