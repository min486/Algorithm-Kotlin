class Solution {
    fun solution(arr: IntArray): IntArray {
        val mn = arr.minOrNull()
        val li = arr.filter { it != mn }
        
        return if (li.isEmpty()) intArrayOf(-1) else li.toIntArray()
    }
}