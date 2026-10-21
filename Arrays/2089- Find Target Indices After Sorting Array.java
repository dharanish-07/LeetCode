class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           if(target==nums[i])
                l.add(i);
            else if(l.size()>0)
            break;
        }
        return l;
    }
}
