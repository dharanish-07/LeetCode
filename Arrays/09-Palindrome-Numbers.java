class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else if(x==0){
            return true;
        }
        else{
            int t=0;
            int n=x;
            while(n>0){
                int m=n%10;
                t=(t*10)+m;
                n=n/10;
                if(t==x){
                    return true;
                }
                
            }
        }
        return false;
    }
}