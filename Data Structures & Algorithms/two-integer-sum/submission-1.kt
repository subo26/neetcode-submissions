class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val array = mutableListOf<Int>()
        for( i in nums.indices){
            for (j in i+1 until nums.size){
                if(nums[i] + nums[j] == target){
                    array.add(i)
                    array.add(j)
                    break
                }
            }
        }
        return array.toIntArray()
    }
}
