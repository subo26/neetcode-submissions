class Solution {
    //BUCKET SORT SOLUTION - O(n)

    /*The reason bucket sort works here is one key observation:
    Frequency of any element can only be between 1 and n (where n = length of input array).
    So instead of sorting by frequency (which costs O(n log n)), 
    you create an array of n+1 buckets where the index itself represents the frequency. No comparisons needed. */
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        val bucket = Array(nums.size + 1){mutableListOf<Int>()} //maintaining an array which has each element as a mutable list
        for ((num, freq) in map){
            bucket[freq].add(num) // in this array index is considered as frequency, and the values at that index is the list of element or elements that appear those many times. 
        }

        //buckets array for [1,2,2,2,3,3,3,3, 4] where 1 -> 1 time, 2 -> 3 times, 3 -> 4 times, 4 appears 1 time
        // 0    1     2   3    4   5  6  7  8  9
        // -  [1,4]   -  [2]  [3]  -  -  -  -  -
        val res = mutableListOf<Int>()
        for(i in (bucket.size - 1) downTo 1){ //traversing the array from right to left
            for(j in bucket[i]){
                res.add(j)
                if(res.size == k){
                    return res.toIntArray()
                }
            }
        }
        return res.toIntArray()

    }

    
}
