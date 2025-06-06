fun main() {
    val st = "abcde".takeLast(3)
    val li = listOf(1, 2, 3).takeLast(2)
    
    val st2 = "abcde".take(3)
    val li2 = listOf(1, 2, 3).take(2)


    println(st)
    println(li)

    println(st2)
    println(li2)
}
