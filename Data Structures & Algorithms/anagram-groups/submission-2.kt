class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for (s in strs){
            val count = IntArray(26)
            for( i in s){
                count[i - 'a']++ //incrementing count of integer frequency array to 1 for the characters that exist in the string
            }
            // On the JVM, arrays use reference equality — two separate IntArray objects with identical contents are considered different by a HashMap:
            //So if we used the raw IntArray as the key, every string would create its own "group" because no two arrays would ever match - different objects in memory!,
            // even for actual anagrams. To fix this, we convert the array into something with value equality — a String works perfectly:
            val key = count.joinToString(",")

            // if(map.containsKey(key)){
            //     map[key]!!.add(s)
            // }else{
            //     val list = mutableListOf()
            //     list.add(s)
            //     map[key] = list
            // }

            map.getOrPut(key){mutableListOf()}.add(s)
        }
        return map.values.toList()
    }
}
