class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        String g="";
        while(i<n||j<m){
            if(i<n){
             char r=word1.charAt(i);
            g=g+r;
            i++;
            }
            if(j<m){
             char e=word2.charAt(j);
            g=g+e;
            j++;
            }
        }
        return g;
    }
}