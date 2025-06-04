class Solution {
    fun solution(n: Long): Long {
        val li = n.toString().toList().sortedDescending()
        return li.joinToString("").toLong()
    }
}