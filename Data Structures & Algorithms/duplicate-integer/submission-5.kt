class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>(nums.size)
        for (n in nums) {
            if (!seen.add(n)) return true
        }
        return false
    }
}