class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        int max=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                int m=accounts[i][j];
                 sum+=m;
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}