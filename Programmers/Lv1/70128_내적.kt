class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var total = 0
        for (i in 0 until a.size) {
            total += a[i]*b[i]
        }
        
        return total        
    }
}