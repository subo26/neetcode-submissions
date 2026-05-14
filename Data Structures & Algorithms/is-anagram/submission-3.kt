class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sMap = HashMap<Char, Int>()
        val tMap = HashMap<Char, Int>()
        for(i in 0 until s.length){
            sMap[s[i]] = (sMap[s[i]] ?: 0) + 1
        }
        for(j in 0 until t.length){
            tMap[t[j]] = (tMap[t[j]] ?: 0) + 1
        }
        return sMap == tMap
    }
}
