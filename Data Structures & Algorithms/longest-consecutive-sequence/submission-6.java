class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int length = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                // first element
                int j = nums[i] + 1;
                int count = 1;
                while (set.contains(j)) {
                    count++;
                    j++;
                }
                length = Math.max(count, length);
            }
        }
        return length;
    }
}

// 1. Sorting and counting ignoring duplicates

// 2 3 4 4 5 10 20
// 2, 3, 4,5 , 10, 20

// Iterate
// j = i+1
// length = 1
// a[j] = a[i]+1