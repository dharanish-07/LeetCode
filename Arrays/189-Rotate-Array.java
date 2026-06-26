class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int e[]=new int[n];
        for(int i=0;i<n;i++){
            e[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[(i+k)%n]=e[i];
        }
    }
}