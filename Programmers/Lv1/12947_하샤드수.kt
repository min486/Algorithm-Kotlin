class Solution {
    fun solution(x: Int): Boolean {
        val total = x.toString().map { it.toString().toInt() }.sum()
        
        return x % total == 0
    }
}