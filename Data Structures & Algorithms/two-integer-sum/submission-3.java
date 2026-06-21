class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complementary = target - nums[i];
            if (map.containsKey(complementary)) {
                int j = map.get(complementary);
                if (i != j) {
                    return new int[] {i, map.get(complementary)};
                }
            }
        }
        return new int[] {};
    }
}
