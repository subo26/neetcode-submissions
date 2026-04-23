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
        val indicesArray = mutableListOf<Int>()
        for (i in nums.indices){
            val difference  = target - nums[i]
            if(numsMap.containsKey(difference)){
                indicesArray.add(numsMap[difference] ?: 0)
                indicesArray.add(i)
            }else{
                numsMap[nums[i]] = i
            }
        }
        return indicesArray.toIntArray()
    }
}
