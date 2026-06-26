class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char ch[]=new char[s.length()];
        for(int k=0;k<s.length();k++){
            ch[k]=s.charAt(k);
        }
        while(i<=j){
           if(!Character.isLetter(ch[i]))
           i++;
           else if(!Character.isLetter(ch[j]))
           j--;
           else{
            char r=ch[i];
            ch[i]=ch[j];
            ch[j]=r;
            i++;
            j--;
           }
        }
        return new String(ch);
    }
}