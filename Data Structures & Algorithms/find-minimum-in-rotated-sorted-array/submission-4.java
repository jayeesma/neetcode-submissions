class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        int min = nums[l];


        while(l<r) {
            if(nums[l]<nums[r]) {
                break;
            } else {
                min = Math.min(min, nums[r]);
                r--;
            }
        }

        return min;


    }
}






