class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numSet = HashSet<Int>()
        for(i in nums){
            if(i in numSet){
                return true
            }
            numSet.add(i)
        }
        return false
    }
}
