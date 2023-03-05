import kotlin.math.max

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val len = nums.size
        var max = 1
        var arr = IntArray(len) { 1 }

        for (i in len - 2 downTo 0) {
            for (j in i + 1 until len) {
                if (nums[i] < nums[j]) {
                    arr[i] = max(arr[i], arr[j] + 1)
                }
            }
            max = max(max, arr[i])
        }
        return max
    }
}
