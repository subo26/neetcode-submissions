class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        //Solution 1 : Sorting (T : O(nlogn), S : O(n))
        // if(s.toCharArray().sorted() == t.toCharArray().sorted()){
        //     return true
        // }
        // return false
        if(s.length != t.length){
            return false
        }
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()
        for(i in 0 until s.length){
            sMap[s[i]] = 1 + (sMap[s[i]] ?: 0)
            tMap[t[i]] = 1 + (tMap[t[i]] ?: 0)
        }
        for (m in sMap.keys){
            if(sMap[m] != (tMap[m] ?: 0))
                return false
        }
        return true
    }

    //int array method (optimal for lowercase alphabets)
    // if (s.length != t.length) return false          // 1

    // val count = IntArray(26)                         // 2

    // for (i in s.indices) {                           // 3
    //     count[s[i] - 'a']++                         // 4
    //     count[t[i] - 'a']--                         // 5
    // }

    // return count.all { it == 0 }                     // 6

}
