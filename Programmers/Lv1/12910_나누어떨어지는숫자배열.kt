class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val li = arr.filter { it % divisor == 0 }.sorted()
        return if (li.isEmpty()) intArrayOf(-1) else li.toIntArray()
    }
}