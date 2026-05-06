class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in nums.indices){
            if(target - nums[i] in map.keys){
                return intArrayOf(map[target-nums[i]]!! , i)
            }else{
                map[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}
