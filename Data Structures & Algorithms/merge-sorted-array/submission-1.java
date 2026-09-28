class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k =0;

        while (i<m && j<n) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            merged[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            merged[k] = nums2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(merged));

        for(int l =0;l<merged.length;l++) {
            nums1[l]=merged[l];
        }
    }
}
