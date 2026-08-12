class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int y=nums[i];
            while(nums[i+1]!=y+1){
            y+=1;
            li.add(y);
            }
        }
        return li;
    }
}
