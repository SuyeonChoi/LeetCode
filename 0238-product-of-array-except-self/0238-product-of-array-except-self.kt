class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        // nums 순차로 곱해지는 누적 곱 배열
        val ascendingProducts = IntArray(nums.size)
        for (i in nums.indices) {
            if (i == 0) {
                ascendingProducts[0] = nums[0]
            } else {
                ascendingProducts[i] = ascendingProducts[i - 1] * nums[i]
            }
        }
        // nums 역순으로 곱해지는 누적 곱 배열
        val descendingProducts = IntArray(nums.size)
        for (i in nums.lastIndex downTo 0) {
            if (i == nums.lastIndex) {
                descendingProducts[i] = nums[i]
            } else {
                descendingProducts[i] = descendingProducts[i + 1] * nums[i]
            }
        }
        val answer = IntArray(nums.size)
        for (i in nums.indices) {
            when (i) {
                0 -> answer[i] = descendingProducts[i + 1]
                nums.lastIndex -> answer[i] = ascendingProducts[i - 1]
                else -> answer[i] = ascendingProducts[i - 1] * descendingProducts[i + 1]
            }
        }
        return answer
    }

}
