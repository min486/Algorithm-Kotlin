fun main() {
    val arr = Array(9) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    var mx = 0
    var row = 0
    var col = 0

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (arr[i][j] >= mx) {
                mx = arr[i][j]
                row = i+1
                col = j+1
            }
        }
    }

    println(mx)
    println("$row $col")
}