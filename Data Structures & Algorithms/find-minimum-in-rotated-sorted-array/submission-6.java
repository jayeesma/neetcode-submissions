class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start!=end) {
            if(nums[start]<nums[end]) {
                return nums[start];
            }

            int mid = start + (end-start)/2;
            if(nums[start]>nums[mid]) {
                end=mid;
            } else if(nums[start]<=nums[mid] && nums[mid]<nums[end]) {
                return start;
            } else {
                start = mid+1;
            }
        }
        return nums[start];
    }
}