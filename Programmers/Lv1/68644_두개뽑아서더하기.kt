class Solution {
    fun solution(numbers: IntArray): IntArray {
        val ansSet = mutableSetOf<Int>()
        
        for (i in 0 until numbers.size-1) {
            for (j in i+1 until numbers.size) {
                ansSet.add(numbers[i] + numbers[j])
            }
        }
        
        return ansSet.sorted().toIntArray()
    }
}