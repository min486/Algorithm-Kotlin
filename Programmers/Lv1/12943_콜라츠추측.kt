class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        
        var cnt = 0
        var n = num.toLong()
        
        while (n != 1L) {
            if (n % 2 == 0L) {
                n = n/2
            } else {
                n = n*3+1
            }
            cnt++
            
            if (cnt == 500) return -1
        }
        
        return cnt
    }
}