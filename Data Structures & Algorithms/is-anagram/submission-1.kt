class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // if(s.toCharArray().sorted().joinToString() == t.toCharArray().sorted().joinToString()){
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
}
