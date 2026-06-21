class Solution {
    public int removeElement(int[] nums, int val) {
        HashMap<Integer, Integer> map = new HashMap();
        int count=0;
        int n = nums.length;
        for(int i = 0; i< n; i++) {
            if(nums[i]!=val) {
                count++;
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }
        int k=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            while(value>0) {
                nums[k] = key;
                k++;
                value--;
            }
        }
        return count;

    }
}


// map

// 0 -> 2
// 1 -> 1
// 2 -> 3
// 3 -> 1
// 4 -> 1