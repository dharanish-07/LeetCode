class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                hs.add(nums.get(j));
                int c=hs.size();
                sum+= c*c;
            }
        }
        return sum;
    }
}
