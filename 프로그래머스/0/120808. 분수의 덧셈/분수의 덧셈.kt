class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val resultNumer = (numer1 * denom2) + (numer2 * denom1)
        val resultDenom = denom1 * denom2
        
        val gcdNum = gcd(resultNumer, resultDenom)
        
        var answer: IntArray = intArrayOf(resultNumer/gcdNum, resultDenom/gcdNum)
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}