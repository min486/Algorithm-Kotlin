import kotlin.math.round

fun main() {
    val n = readLine()!!.toInt()
    val li = List(n) { readLine()!!.toInt() }.sorted()

    val ans = round(li.sum().toDouble() / n).toInt()

    val ans2 = li[n / 2]

    val mp = mutableMapOf<Int, Int>()
    for (i in li) {
        mp[i] = mp.getOrDefault(i, 0) + 1
    }

    val maxCnt = mp.values.max()
    val li_keys = mp.filter { it.value == maxCnt }.keys.sorted()
    val ans3 = if (li_keys.size >= 2) li_keys[1] else li_keys[0]

    val ans4 = li.last() - li.first()

    println(ans)
    println(ans2)
    println(ans3)
    println(ans4)
}