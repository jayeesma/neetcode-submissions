class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, target, nums);
    }
    private int binarySearch(int start, int end, int target, int[] nums) { 
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        return (target<nums[mid]) ? 
        binarySearch(start,mid-1,target,nums) :
        binarySearch(mid+1, end, target, nums);
        
    }
}
