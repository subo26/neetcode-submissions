class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        for(i in nums.indices){
            var product = 1
            for(j in nums.indices.reversed()){
                if(i != j) 
                 {
                product = product * nums[j]
                 }
            }
            arr[i] = product
        }
        print(arr)
        return arr
    }
}
