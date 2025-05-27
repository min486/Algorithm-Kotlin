class Solution {
    fun solution(n: Long): Long {
        val li = n.toString().toCharArray()
        li.sortDescending()
        
        return String(li).toLong()
    }
}