class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val arr = nums.sorted()

        for (i in 0 until arr.size - 1) {
            if (arr[i] == arr[i + 1]) {
                return true
            }
        }

        return false
    }
}