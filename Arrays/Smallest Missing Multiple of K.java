class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }      
        int y=k;
        for(int i=0;i<n;i++)
        {
            if(hs.contains(y)) y+=k;
            else
                break;
        }
        return y;
    }
}
