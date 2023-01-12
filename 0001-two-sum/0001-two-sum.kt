class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numbers = HashMap<Int, Int>() // value와 index
        for (idx in nums.indices) {
            numbers[nums[idx]] = idx
        }
        for (idx in nums.indices) {
            val pairIdx = numbers[target - nums[idx]]
            if (pairIdx != null) {
                if (idx == pairIdx) continue
                return intArrayOf(idx, pairIdx)
            }
        }
        return intArrayOf()
    }
}
