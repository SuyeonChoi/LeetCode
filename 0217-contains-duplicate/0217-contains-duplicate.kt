class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val save = mutableSetOf<Int>()
        for (num in nums) {
            if (save.contains(num)) return true
            save.add(num)
        }
        return false
    }
}
