class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int n=s.size();
        for(int i=0;i<=n;i++){
            if(s.contains(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return 0;
    }
}