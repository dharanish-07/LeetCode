class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = nums.length;
        // if(k==1 && nums[0]==nums[nums.length-1]) return -1;
        for (int i = 0; i < nums.length; i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        int max = -1;
        if (k == nums.length) {
            for (int i = 0; i < n; i++)
                max = Math.max(nums[i], max);

            return max;
        }
        if (k == 1) {
            max = -1;
            for (int i = 0; i < n; i++) {
                if (h.get(nums[i]) == 1)
                    max = Math.max(nums[i], max);
            }
            return max;
        }

        int s = h.get(nums[0]);
        int e = h.get(nums[nums.length - 1]);
        if (nums[0] == nums[n - 1])
            return -1;
        if (s == 1 && e == 1)
            return Math.max(nums[0], nums[n - 1]);
        if (s == 1 && e > 1)
            return nums[0];
        if (s > 1 && e == 1)
            return nums[nums.length - 1];
        return -1;
    }
}
