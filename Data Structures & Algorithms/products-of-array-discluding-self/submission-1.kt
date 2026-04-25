class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val prefixArr = IntArray(nums.size)
        val suffixArr = IntArray(nums.size)

        prefixArr[0] = 1
        for(i in nums.indices){
            if(i == 0) continue
            prefixArr[i] = prefixArr[i-1] * nums[i-1]
        }
        suffixArr[nums.size - 1] = 1
        for(j in nums.indices.reversed()){
            if(j == nums.size - 1) continue
            suffixArr[j] = suffixArr[j+1] * nums[j+1]
        }

        for(i in res.indices){
            res[i] = prefixArr[i] * suffixArr[i]
        }
        return res
    }
}
