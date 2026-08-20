class Solution {
    public int[] resultArray(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] res = new int[nums.length];

        int count1 = 1;
        int count2 = 1;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for (int i = 2; i < nums.length; i++) {

            if (arr1[count1 - 1] > arr2[count2 - 1]) {
                arr1[count1] = nums[i];
                count1++;
            } 
            else {
                arr2[count2] = nums[i];
                count2++;
            }
        }
        int k = 0;

        for (int i = 0; i < count1; i++) {
            res[k++] = arr1[i];
        }

        for (int i = 0; i < count2; i++) {
            res[k++] = arr2[i];
        }

        return res;
    }
}
