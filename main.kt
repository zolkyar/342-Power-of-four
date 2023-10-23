class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if (n == 0) {return false}
        else if (n == 1) {return true}
        
        var n = n
        var tmp = 1
        
        for (i in 1..31){
            tmp = tmp * 4
            if(tmp > n) {return false}
            else if (n == tmp) {return true}
        }
        
        return false
    }
}