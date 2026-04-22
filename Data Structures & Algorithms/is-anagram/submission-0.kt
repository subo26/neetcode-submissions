class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.toCharArray().sorted() == t.toCharArray().sorted()){
            return true
        }
        return false
    }
}
