class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sortedNums = nums.sorted()
        val triplets = HashSet<Triplet>()
        for (i in sortedNums.indices) {
            for (j in i + 1 until sortedNums.size) {
                val twoSum = sortedNums[i] + sortedNums[j]
                val thirdIndex = sortedNums.binarySearch(-twoSum)
                if (thirdIndex < 0 || thirdIndex == i || thirdIndex == j) continue
                val selectedNums = intArrayOf(sortedNums[i], sortedNums[j], -twoSum).sorted()
                triplets.add(Triplet(selectedNums[0], selectedNums[1], selectedNums[2]))
            }
        }
        val answer = ArrayList<ArrayList<Int>>()
        for (triplet in triplets) {
            answer.add(arrayListOf(triplet.num1, triplet.num2, triplet.num3))
        }
        return answer
    }
}

data class Triplet(val num1: Int, val num2: Int, val num3: Int)

