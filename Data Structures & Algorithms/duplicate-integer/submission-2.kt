class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        // var isDuplicate = false
        // for(i in 0 .. nums.size){
        //     // for(j in i + 1 until nums.size){
        //     //     if(nums[i] == nums[j]){
        //     //         isDuplicate = true
        //     //     }
        //     // }
        //     if(nums[i] == nums[i+1] && i != 3){
        //         isDuplicate = true
        //     }
        // }
        // return isDuplicate
        val numSet = mutableSetOf<Int>()
        for(i in nums){
            if(i in numSet){
                return true
            }
            numSet.add(i)
        }
        return false
    }
}
