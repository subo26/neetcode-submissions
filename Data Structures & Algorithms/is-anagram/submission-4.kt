class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val map = HashMap<Char, Int>()
        for(i in 0 until s.length){
            map[s[i]] = (map[s[i]] ?: 0)  + 1
            map[t[i]] = (map[t[i]] ?: 0)  - 1
        }

        for(j in map.values){
            if(j != 0) return false
        }
        return true
    }
}
