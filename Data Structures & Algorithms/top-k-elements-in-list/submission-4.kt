class Solution {
    // fun topKFrequent(nums: IntArray, k: Int): IntArray {
    //     val map = HashMap<Int, Int>()
    //     for(i in nums){ //O(n)
    //             map[i] = 1 + (map[i] ?: 0)
    //     }
    //     //using a priority queue here for maxHeap logic. If we dont add the compareByDescending predicate, it is a min-heap by default.
    //     //addition and removal in priority queue takes O(logn) time
    //     val pq = PriorityQueue<Int>(compareByDescending { map[it] }) // compareByDescending{ predicate based on what to sort the collection by, here we are sorting it by the values in the map}
    //     //basically keys will be bubbled up in the map based on the values in the map
    //     for (i in map.keys){ //O(n)
    //         pq.add(i) // O(logn)
    //     } //inserting all keys - O(n log n)
    //     val result = mutableListOf<Int>()
    //     repeat(k) {
    //         result.add(pq.poll()) //polling - O(logn)
    //     } //repeating for K times - O(k log n)
    //     return result.toIntArray()

    //     //Final TC - O(n) + O(nlogn) + O(klogn) ==> O(n log n) as k<=n
    // }

    //Using Min Heap 
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums) {
            map[i] = 1 + (map[i] ?: 0)
        }

        // Min-heap — least frequent element sits at the top
        val pq = PriorityQueue<Int>(compareBy { map[it] })

        for (key in map.keys) {
            pq.add(key)
            if (pq.size > k) {
                pq.poll()  // evict the least frequent — it can't be in top k
            }
        }

        return pq.toIntArray()

        //TC - O (nlogk), SC = O(n+k)
    }

    
}
