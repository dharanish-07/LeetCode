class Solution {
    public String firstPalindrome(String[] words) {
        for(String o:words){
            int i=0,j=o.length()-1;
            while(i<=j&&o.charAt(i)==o.charAt(j)){
                    i++;
                    j--;
                }
                if(i>=j)
                return o;
        }
        return "";
    }
}