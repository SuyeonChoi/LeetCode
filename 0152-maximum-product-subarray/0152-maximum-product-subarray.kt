import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxProduct(nums: IntArray): Int {
        val productDP = Array(nums.size) { IntArray(2) }
        var answer = nums[0]
        for (idx in nums.indices) {
            if (idx == 0) {
                productDP[0][0] = nums[0] // 가장 큰 절댓값 음수 저장
                productDP[0][1] = nums[0] // 양수 저장 또는 현재까지의 최댓값 저장
            } else {
                if (nums[idx] >= 0) { // 현재가 양수이면
                    productDP[idx][0] = min(productDP[idx - 1][0] * nums[idx], nums[idx])
                    productDP[idx][1] = max(productDP[idx - 1][1] * nums[idx], nums[idx])
                } else { // 현재가 음수이면
                    productDP[idx][0] = min(productDP[idx - 1][1] * nums[idx], nums[idx])
                    productDP[idx][1] = max(productDP[idx - 1][0] * nums[idx], nums[idx])
                }
            }
            answer = max(answer, max(productDP[idx][0], productDP[idx][1]))
        }
        return answer
    }
}
