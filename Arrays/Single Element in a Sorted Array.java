class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(hs.contains(nums[i]))
                hs.remove(nums[i]);
            else
            hs.add(nums[i]);
        }
        int v=0;
        for(int i:hs)
        {
            v=i;
        }
        return v;
    }
}



// optimized code 1 ms
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int ans=0;
        for(int i:nums)
        {
            ans^=i;
        }
        return ans;
    }
}
