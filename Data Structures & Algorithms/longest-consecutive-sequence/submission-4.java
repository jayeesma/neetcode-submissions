class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int num :nums) {
            set.add(num);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            int k = 1;
            while(set.contains(nums[i]+k)) {
                k++;
            }
            count = Math.max(count, k);
        }
        return count;
    }
}
