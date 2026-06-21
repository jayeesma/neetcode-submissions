class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        HashSet<Integer> set = new HashSet();
        for(int num:nums) {
            set.add(num);
        } 
        int max = 0;

        for(int num: nums) {
            if(!set.contains(num-1)) {
                int length = 1;
                while(set.contains(num+length)) {
                    length ++;
                }
                max = Math.max(max,length);

            }
        }
        return max;

        
    }
}
