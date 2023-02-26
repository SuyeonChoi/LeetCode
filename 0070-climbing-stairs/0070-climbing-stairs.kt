class Solution {
    fun climbStairs(n: Int): Int {
        val stairs = Array(n + 1) { IntArray(2) { 0 } }
        for (i in 1..n) {
            if (i == 1) {
                stairs[1][0] = 1
            } else if (i == 2) {
                stairs[2][0] = 1
                stairs[2][1] = 1
            } else {
                stairs[i][0] = stairs[i - 1][0] + stairs[i - 1][1]
                stairs[i][1] = stairs[i - 2][0] + stairs[i - 2][1]
            }
        }

        return stairs[n][0] + stairs[n][1]
    }
}
