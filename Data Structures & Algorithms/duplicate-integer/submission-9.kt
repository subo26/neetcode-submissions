class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for (i in nums.indices){
            if(nums[i] in set){
                return true
            }
            set.add(nums[i])
        }

        return false
    }
}