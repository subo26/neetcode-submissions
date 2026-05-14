class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        var sum = 0
        var count = 0
        map[0] = 1
        for(i in nums.indices){
            sum += nums[i]
            val diff = sum - k
            if(diff in map){
                count = count + map[diff]!!
            }
            map[sum] =  map.getOrDefault(sum, 0) + 1
        }
        return count
    }
}
