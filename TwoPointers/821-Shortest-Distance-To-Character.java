class Solution {
public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                arr[i]=0;
            }
            else{
                int l=i-1,r=i+1;
                while(l>=0&&s.charAt(l)!=c){
                        l--;
                }
                while(r<s.length()&&s.charAt(r)!=c){
                    r++;
            
                if(l<0){
                    arr[i]=r-i;
                }
                else if(r>=s.length()){
                    arr[i]=i-l;
                }
                else{
                    int o=r-i;
                    int p=i-l;
                    if(o<=p){
                        arr[i]=o;
                    }
                    else
                    arr[i]=p;
                }
            }
        }
        return arr;
    }
}