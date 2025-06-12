fun main() {
    val n = readLine()!!
    val li = readLine()!!.split(" ").map { it.toInt() }
    val m = readLine()!!
    val li2 = readLine()!!.split(" ").map { it.toInt() }

    val mp = mutableMapOf<Int, Int>()
    
    for (i in li) {
        mp[i] = mp.getOrDefault(i, 0) + 1
    }

    val ans = li2.map { mp[it] ?: 0 }

    println(ans.joinToString(" "))
}