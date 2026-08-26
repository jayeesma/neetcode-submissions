class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        for(int i=0;i<nums.length-2;i++) {

            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;
            int target = -nums[i];

            while(left<right) {
                if(nums[left]+nums[right]>target) {
                    right--;
                } else if(nums[left]+nums[right]<target) {
                    left++;
                } else {
                    res.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left]) {
                        left++;
                    }
                }
            }
            
        }
        return res;
    }
}
