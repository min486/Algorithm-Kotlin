fun main() {
    while (true) {
        val line = readLine()!!
        if (line == ".") break

        val stack = mutableListOf<Char>()
        var check = true

        for (ch in line) {
            when (ch) {
                '(', '[' -> stack.add(ch)
                ')' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size-1) != '(') {
                        check = false
                        break
                    }
                }
                ']' -> {
                    if (stack.isEmpty() || stack.removeAt(stack.size-1) != '[') {
                        check = false
                        break
                    }
                }
            }
        }

        if (stack.isNotEmpty()) check = false

        if (check) println("yes") else println("no")
    }
}