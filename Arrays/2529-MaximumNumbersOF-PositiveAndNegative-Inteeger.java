class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int p=0,ne=0;
        for(int i=0;i<n;i++){
            int m=nums[i];
            if(m>0) p++;
            else if(m<0) ne++;
        }
        return p>ne?p:ne;
    }
}