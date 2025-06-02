class Solution {
    fun solution(s: String): String {
        var answer = ""
        var idx = 0
        
        for (ch in s) {
            if (ch == ' ') {
                answer += ' '
                idx = 0
            } else {
                if (idx % 2 == 0) {
                    answer += ch.uppercase()
                } else {
                    answer += ch.lowercase()
                }
                idx++
            }
        }
        
        return answer
    }
}