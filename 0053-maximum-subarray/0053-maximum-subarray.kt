import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        val subSums = IntArray(nums.size)
        var answer = Int.MIN_VALUE
        for (i in nums.indices) {
            if (i == 0) {
                subSums[0] = nums[0]
            } else {
                subSums[i] = max(subSums[i - 1] + nums[i], nums[i])
            }
            answer = max(answer, subSums[i])
        }
        return answer
    }
}