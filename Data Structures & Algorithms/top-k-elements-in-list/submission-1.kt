class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for(i in nums){
                map[i] = 1 + (map[i] ?: 0)
        }
        val sortedList = map.keys.sortedByDescending { map[it] }.take(k)
        println(sortedList)
        
        return sortedList.toIntArray()
    }
}
