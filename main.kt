class Solution {
    fun isPowerOfFour(n: Int): Boolean {        
        var n = n
        var tmp = 1
        
        for (i in 1..31){
            if(tmp > n) {return false}
            else if (n == tmp) {return true}
            tmp = tmp * 4
        }
    
        return false
    }
}