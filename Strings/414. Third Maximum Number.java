class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE,sec=Long.MIN_VALUE,th=Long.MIN_VALUE; // long used for this test case => [1,2,-2147483648] ans :-2147483648
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                th=sec;
                sec=max;
                max=nums[i];
            }
            else if(nums[i]>sec&&nums[i]!=max)
            {
                th=sec;
                sec=nums[i];
            }
            else if(nums[i]>th&&nums[i]!=max&&nums[i]!=sec) th=nums[i];
        }
        if(th==Long.MIN_VALUE) return (int)max;
        return (int)th;
    }
}
