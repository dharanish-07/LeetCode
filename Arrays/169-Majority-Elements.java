class Solution {
    public int majorityElement(int[] nums) {
        int o=nums.length/2,p=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>=o){
               return nums[i];
            }
        }
        return p;
    }
}