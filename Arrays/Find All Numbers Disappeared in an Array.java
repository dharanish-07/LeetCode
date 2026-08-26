class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=1;i<=n;i++)
        {
            if(!hs.contains(i))
                a.add(i);
        }
        return a;
    }
}



//optimized  4 ms
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        List<Integer> a=new ArrayList<>();
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]=1;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i]!=1)
                a.add(i);
        }
        return a;
    }
}
