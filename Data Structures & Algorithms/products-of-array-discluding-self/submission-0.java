class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int l = 0;
            int r = i + 1;
            prefix[i] = 1;
            suffix[i] = 1;
            while (l < i) {
                prefix[i] = prefix[i] * nums[l];
                l++;
            }
            while (r < nums.length) {
                suffix[i] = suffix[i] * nums[r];
                r++;
            }
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }
}
