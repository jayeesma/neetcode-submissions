class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

    
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            } 
            map.put(nums[i],i);
        }

        return new int[]{};
    }
}

// 3->4
//

// 3. -> 4
// 4


// 4. -> 0
// 3. -> 1
// 2  -> 2
// 1-> 3



// 5-> 1

// 1->0
// 3->1


