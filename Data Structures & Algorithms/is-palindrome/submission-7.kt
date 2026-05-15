class Solution {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase()
        var left = 0
        var right = str.length - 1
        while(left < right){
            while(left < right && !str[left].isLetterOrDigit()){
                left++
            }
            while(left < right && !str[right].isLetterOrDigit()){
                right--
            }
            if(left < right && str[left] != str[right] ){
                return false
            }
            left++
            right--
        }
        return true
    }
}
