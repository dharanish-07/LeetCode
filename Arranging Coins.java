class Solution {
    public int arrangeCoins(int n) {

        long v = 0;

        for (int i = 1; i <= n; i++) {

            v += i;

            if (v > n) {
                return i - 1;
            }
        }

        return n;
    }
}


// optimize 5 ms 
class Solution {
    public int arrangeCoins(int n) {
        int i =1;
        while(n>=i){
            n-=i;
            i++;

        }
        return i-1;

        
    }
}
