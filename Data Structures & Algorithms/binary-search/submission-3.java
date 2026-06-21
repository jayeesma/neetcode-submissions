class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        return binarySearch(0, n-1, target, nums);
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
