class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Using Bucket Sort

        List<Integer>[] freq = new List[nums.length + 1];
        HashMap<Integer, Integer> countMap = new HashMap();

        // we dont know the length of the list. It is dynamic
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList();
        }

        // get the counts
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // fill the freq
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0; i--) {
            for (int num : freq[i]) {
                res[index] = num;
                index++;
                if (index == k) {
                    return res;
                }
            }
        }

        return new int[0];
    }
}

// [1, 2, 3, 3]

//     // To store the integer as per their freq - create list of group
//     // freq[1] = 1,2
//     // freq[2] = []
//     // freq[3] = 3

//     // max freq[] length is