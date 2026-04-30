class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val map = HashMap<Pair<Int,Int>, HashSet<Char>>()

        for(i in 0 until board.size){
            val rSet = HashSet<Char>()
            val cSet = HashSet<Char>()
            for(j in 0 until board.size){
                //rows
                val rowVal = board[i][j]
                val colVal = board[j][i]
                if(rowVal != '.' && rowVal in rSet){
                    return false
                }else{
                    rSet.add(rowVal)
                }

                //Columns
                if(colVal != '.' && colVal in cSet){
                    return false
                }else{
                    cSet.add(colVal)
                }

                //3x3 matrix
                val key = Pair(i / 3, j / 3)
                if (!map.containsKey(key)) map[key] = HashSet()
                val bSet = map[key]!!
                if (rowVal != '.' && rowVal in bSet) return false
                bSet.add(rowVal)
            }
            println("row set --> $rSet")
            println("column set --> $cSet")

        }
        return true
    }
}
