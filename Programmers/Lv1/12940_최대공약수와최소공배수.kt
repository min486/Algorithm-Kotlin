class Solution {
    fun solution(n: Int, m: Int): IntArray {
        // 최대공약수 구하기 : 유클리드 호제법
        fun gcd(a: Int, b: Int): Int {
            return if (b == 0) a else gcd(b, a%b)
        }
        
        val maxDiv = gcd(n, m)
        val minMul = n*m / maxDiv
        
        return intArrayOf(maxDiv, minMul)
    }
}