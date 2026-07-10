class Solution {
    public boolean canJump(int[] nums) {
        
        int i =0;
        int max = 0;
        while(i<nums.length) {

            if(max<i) {
                return false;
            }

            max = Math.max(max, nums[i]+i);
            i++;

        }
        return true;

    }
}

