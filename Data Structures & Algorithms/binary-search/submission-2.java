class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        return binarySearch(start, end, target, nums);
    }
    private int binarySearch(int start, int end, int target, int[] nums) {
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (target == nums[mid]) {
            return mid;
        }
        if (target < nums[mid]) {
            end = mid-1;
            return binarySearch(start, end, target, nums);
        }
        if (target > nums[mid]) {
            start = mid + 1;
            return binarySearch(start, end, target, nums);
        }
        return -1;
    }
}
