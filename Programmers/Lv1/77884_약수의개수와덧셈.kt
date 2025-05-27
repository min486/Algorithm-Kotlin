class Solution {
    fun solution(left: Int, right: Int): Int {
        var total = 0
        
        for (i in left..right) {
            var cnt = 0
            for (j in 1..i) {
                if (i % j == 0) {
                    cnt += 1
                }
            }
            
            if (cnt % 2 == 0) {
                total += i
            } else {
                total -= i
            }
        }
        
        return total
    }
}