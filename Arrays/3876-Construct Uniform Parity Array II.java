class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int n:nums1)
        {
            min=Math.min(min,n);
        }
        if(min%2==1)  // start itself odd then all possible to be odd ex: 123 -> 1-2=1
            return true;
        for(int i:nums1)   
        {
            if(i%2==1) // once even start then no odd must be exist  ex 214 -> 2-1=1 still odd
                return false;
        }
        return true;
    }
}
