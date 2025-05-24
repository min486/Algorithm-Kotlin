class Solution {
    fun solution(s: String): String {
        val mid = s.length / 2
        var ans: String
        
        if (s.length % 2 == 1) {
            ans = s[mid].toString()
        } else {
            ans = s.substring(mid-1, mid+1)
        }
        
        return ans
    }
}