class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val prefixArr = IntArray(nums.size)
        val suffixArr = IntArray(nums.size)

        prefixArr[0] = 1
        for(i in 1 until nums.size){
            // if(i == 0) continue
            prefixArr[i] = prefixArr[i-1] * nums[i-1]
        }
        suffixArr[nums.size - 1] = 1
        for(j in nums.size - 2 downTo 0){
            // if(j == nums.size - 1) continue
            suffixArr[j] = suffixArr[j+1] * nums[j+1]
        }

        for(i in res.indices){
            res[i] = prefixArr[i] * suffixArr[i]
        }
        return res
    }
}
