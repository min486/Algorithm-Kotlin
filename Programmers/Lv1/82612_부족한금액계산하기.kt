class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var total: Long = 0
        
        for (i in 1..count) {
            total += price.toLong() * i
        }
        
        if (money.toLong() < total) {
            return total - money
        } else {
            return 0
        }
    }
}