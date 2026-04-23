class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Sol 1 : brute force
        // val array = mutableListOf<Int>()
        // for( i in nums.indices){
        //     for (j in i+1 until nums.size){
        //         if(nums[i] + nums[j] == target){
        //             array.add(i)
        //             array.add(j)
        //             break
        //         }
        //     }
        // }
        // return array.toIntArray()

        val numsMap = mutableMapOf<Int, Int>()
        // val indicesArray = mutableListOf<Int>() - cleaned up extra space allocation for list and overhead of converting to integer array later
        for (i in nums.indices){
            val difference  = target - nums[i]
            if(numsMap.containsKey(difference)){
                // indicesArray.add(numsMap[difference]!!)
                // indicesArray.add(i)
                return intArrayOf(numsMap[difference]!!, i ) //early return added + no extra space required
            }else{
                numsMap[nums[i]] = i
            }
        }
        // return indicesArray.toIntArray()
        return intArrayOf()
    }
}
