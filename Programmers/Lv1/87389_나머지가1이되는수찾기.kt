class Solution {
    fun solution(n: Int): Int {
        for (i in 2 until n) {
            if (n % i == 1) {
                return i
            }
        }
        
        return -1  // 코드 실행을 위한 return (실행되지 않음) 
    }
}