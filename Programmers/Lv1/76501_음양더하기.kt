class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var total = 0
        for ((idx, value) in absolutes.withIndex()) {
            total += if (signs[idx]) value else -value
        }
        
        return total        
    }
}