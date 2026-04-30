class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var longest = 0
        var startNum = 0
        for(num in set){
            if(num - 1 !in set){ //check if it is the start of the sequence, is there is any number in the set which is 1 less than the num we are at, it cannot be the starting point.
                startNum = num //set this value as the startNum (start of seq)
                var length = 1 
                while(startNum + 1 in set){ //keep checking for sequential values
                    length++ //increase length of the seq
                    startNum++ //increment start num by 1 so as to check for next nuimber in sequence
                }
                longest = maxOf(longest, length)
            }

        }
        return longest
    }
}
