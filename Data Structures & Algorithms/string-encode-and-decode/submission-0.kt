class Solution {

    fun encode(strs: List<String>): String {
        //take out the strings from the list, parse each string
        var str = ""
        for(i in strs){
            str = str + i.length + "#" + i //encoding string as -> length of string + # + the string itself
            //example => 5#Hello5#World
        }
        println(str)
        return str
    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var i = 0
        while(i < str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }
            var length = str.substring(i,j).toInt()
            list.add(str.substring(j+1, j+1+length))
            i = j+1+length
        }
        println(list)
        return list
    }
}
