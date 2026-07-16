class Solution {
    public char findTheDifference(String s, String t) {
       int i=0,j=0;
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        while(i<s.length()&&j<t.length()){
            if(ch[i]==ch1[j]){
                i++;
                j++;
            }
            else{
        return ch1[j]; 
            }
        }
        return ch1[j];
    }
}