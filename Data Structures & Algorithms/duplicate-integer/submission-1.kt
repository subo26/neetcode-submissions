class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var isDuplicate = false
        for(i in 0 until nums.size){
            for(j in i + 1 until nums.size){
                if(nums[i] == nums[j]){
                    isDuplicate = true
                }
            }
        }
        return isDuplicate
    }
}
