class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> x=new HashSet<>();
        for(int i:nums1){
            x.add(i);
        }
        HashSet<Integer> y=new HashSet<>();
        for(int j:nums2){
            y.add(j);
        }
         x.retainAll(y);
         int i=0;
         int[] arr=new int[x.size()];
         for(int k:x){
            arr[i++]=k;
         }
         return arr;
    }
}