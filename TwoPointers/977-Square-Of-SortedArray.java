class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=0,j=n-1,o=n-1;
        while(i<=j){
            int x=nums[i]*nums[i];
            int y=nums[j]*nums[j];
            if(x<y){
                arr[o--]=y;
                j--;
            }
            else {
                arr[o--]=x;
                i++;
            }
        }
        return arr;
    }
}