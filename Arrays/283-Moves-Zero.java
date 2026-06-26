class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int t=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[t++]=nums[i];
            }
        }
        for(int i=t;i<n;i++){
            nums[i]=0;
        }
    }
}