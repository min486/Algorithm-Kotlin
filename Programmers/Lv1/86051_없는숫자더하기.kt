class Solution {
    fun solution(numbers: IntArray): Int {
        var total = 0
        for (i in 0..9) {
            if (i !in numbers) {
                total += i
            }
        }
        
        return total
    }
}