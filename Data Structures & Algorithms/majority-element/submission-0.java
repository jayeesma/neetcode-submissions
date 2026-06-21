class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i< nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        return map.entrySet().stream().sorted((a,b)-> b.getValue()-a.getValue())
        .findFirst()
        .get()
        .getKey();
     }
}


// 5 -> 4
// 1->3

// 3

// sort -> values in desc

// get the top value


// O(n) + O(mlogm)

