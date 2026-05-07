class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        for (i in nums.indices){
            if(nums[i] in map){
                return true
            }
            map[nums[i]] = 1
        }

        return false
    }
}