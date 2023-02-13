import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var result = 0

        while (left < right) {
            result = max(result, min(height[left], height[right]) * (right - left))
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}