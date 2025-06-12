fun main() {
    val li = List(5) { readLine()!! }
    var ans = ""
    
    for (i in 0 until 15) {
        for (st in li) {
            if (i < st.length) {
                ans += st[i]
            }
        }
    }
    
    println(ans)
}