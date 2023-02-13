import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var result = 0

        while (left < right) {
            val leftHeight = height[left]
            val rightHeight = height[right]
            result = max(result, min(leftHeight, rightHeight) * (right - left))
            if (leftHeight < rightHeight) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}
