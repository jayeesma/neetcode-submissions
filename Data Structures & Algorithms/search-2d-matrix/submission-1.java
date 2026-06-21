class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int[] ar = matrix[i];
            int m = matrix[i].length;
            if (ar[0] <= target && target <= ar[m - 1]) {
                return binarySearch(ar, 0, m - 1, target);
            }
        }
        return false;
    }

    public boolean binarySearch(int[] ar, int start, int end, int target) {
        int mid = start + (end - start) / 2;

        if (target == ar[mid]) {
            return true;
        }
        if (start > end) {
            return false;
        }
        if (target < ar[mid]) {
            end = mid - 1;
            return binarySearch(ar, 0, end, target);
        }
        if (target > ar[mid]) {
            start = mid + 1;
            return binarySearch(ar, start, end, target);
        }
        return false;
    }
    
}
