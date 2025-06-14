fun main() {
    val n = readLine()!!.toInt()
    val mp = mutableMapOf<String, Int>()

    for (i in 0 until n) {
        val title = readLine()!!
        mp[title] = mp.getOrDefault(title, 0) + 1
    }

    // 가장 많이 팔린 횟수
    val maxCnt = mp.values.max()

    // maxCnt 가진 책들만 필터링 후 사전순 정렬
    val ans = mp
        .filter { it.value == maxCnt }
        .keys
        .sorted()

    println(ans[0])
}