fun main(args: Array<String>) {   
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    
    for (i in 0 until m) {
        println("*".repeat(n))
    }
}