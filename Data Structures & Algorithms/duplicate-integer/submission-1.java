class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int num: nums) {
            numsMap.put (num, numsMap.getOrDefault(num,0)+1);
        }

        for(int val: numsMap.values()){
            if(val>1) {
                return true;
            }
        }
        return false;
    }
}