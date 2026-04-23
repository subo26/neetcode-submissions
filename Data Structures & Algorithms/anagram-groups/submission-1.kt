class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for (s in strs){
            val count = IntArray(26)
            for( i in s){
                count[i - 'a']++
            }
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
