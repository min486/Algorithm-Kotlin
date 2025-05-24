class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        for (ch in s) {
            if (ch == ' ') {
                answer += ' '
            } else {
                val base = if (ch.isUpperCase()) 'A' else 'a'
                val change = ((ch-base+n) % 26 + base.code).toChar()
                answer += change
            }
        }
        
        return answer
    }
}