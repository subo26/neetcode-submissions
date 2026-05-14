class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        for ( i in nums.indices){
            var diff = k
            for(j in i until nums.size){
               diff = diff - nums[j]
               if(diff == 0){
                count++
               }
            }
        }
        return count
    }
}
