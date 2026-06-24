class Solution {
    public int maxProfit(int[] prices) {
        int c=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
             min=prices[i];
             
            if(prices[i]>min&&c<prices[i]-min)
             c=prices[i]-min;
        }
        return c;
    }
}
