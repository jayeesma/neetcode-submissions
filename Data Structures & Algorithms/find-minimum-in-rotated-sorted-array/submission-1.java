class Solution {
    public int findMin(int[] nums) {

        int min = nums[0];
        int i=0;
        int j=nums.length - 1;
        while(i<j) {
            if(nums[i]>nums[j]) {
                min = Math.min(min,nums[j]);
                j--;
            } else {
                i++;
            }
        }

        return min;
        
    }
}

