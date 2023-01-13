import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var purchasePrice = prices[0]
        var maxMargin = 0
        for (i in 1 until prices.size) {
            if (prices[i] < purchasePrice) {
                purchasePrice = prices[i]
            }
            maxMargin = max(maxMargin, prices[i] - purchasePrice)
        }
        return maxMargin
    }
}
