class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int j=0;j<nums.length;j++) {
            
            sum+=nums[j];

            while(sum>=target) {
                sum -=nums[i];
                min = Math.min(min,j-i+1);
                i++;
            }

            
        }
        if(min>nums.length) {
            return 0;
        }
        return min;
    }
}