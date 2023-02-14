class Solution {
    fun getSum(a: Int, b: Int): Int {
        if (b == 0) return a
        return getSum(a xor b, (a and b) shl 1)
    }
}
