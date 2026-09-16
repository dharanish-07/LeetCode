class Solution {
    public boolean hasAlternatingBits(int n) {
       int pre=-1;
       while(n>0)
       {
        int cur=n%2;
        if(cur==pre) return false;
        pre=cur;
        n/=2;
       }
       return true;
    }
}
