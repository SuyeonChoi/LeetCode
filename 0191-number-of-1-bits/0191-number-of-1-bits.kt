class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        var n = n
        var count = 0
        while (n != 0) {
            if (n and 1 == 1) count++
            n = n ushr 1
        }
        return count
    }
}
