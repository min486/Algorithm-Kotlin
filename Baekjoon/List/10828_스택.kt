fun main() {
    val n = readLine()!!.toInt()
    val stack = mutableListOf<Int>() 

    for (i in 0 until n) {
        val li = readLine()!!.split(" ")

        if (li[0] == "push") {
            stack.add(li[1].toInt())
        } else if (li[0] == "pop") {
            if (stack.isEmpty()) {
                println(-1)
            } else {
                println(stack.removeAt(stack.size-1))
            }
        } else if (li[0] == "size") {
            println(stack.size)
        } else if (li[0] == "empty") {
            if (stack.isEmpty()) {
                println(1)
            } else {
                println(0)
            }
        } else if (li[0] == "top") {
            if (stack.isEmpty()) {
                println(-1) 
            } else {
                println(stack[stack.size-1])
            }
        }
    }
}