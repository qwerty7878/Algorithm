class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {        
        var top = (numer1 * denom2) + (numer2 * denom1)
        var down = denom1 * denom2
        
        val num = gcd(top, down)
        
        return intArrayOf(top / num, down / num)
    }
    
    fun gcd(a: Int, b: Int): Int{
        if (b == 0){
            return a
        }
        return gcd(b, a % b)
    }
}