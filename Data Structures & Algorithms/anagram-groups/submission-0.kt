class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for( i in strs){
            val sortedString = i.toCharArray().sorted().joinToString("")
            if(map.containsKey(sortedString)){
                map[sortedString]!!.add(i)
            }else{
                val list = mutableListOf<String>()
                list.add(i)
                map[sortedString] = list
            }
        }
        return map.values.toList()
    }
}
