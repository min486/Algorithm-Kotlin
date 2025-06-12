fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr_a = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    val arr_b = Array(n) { readLine()!!.split(" ").map { it.toInt() } }

    val ans = Array(n) { i -> 
        IntArray(m) { j -> 
            arr_a[i][j] + arr_b[i][j]
        }
    }

    for (row in ans) {
        println(row.joinToString(" "))
    }
}