class Solution {
    public String removeTrailingZeros(String num) {
      int n=num.length();
      for(int i=n-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
                n-=1;
            else
                break;
        }
        return num.substring(0,n);
    }
}
