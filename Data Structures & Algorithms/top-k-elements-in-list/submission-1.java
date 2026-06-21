class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> resultMap = new HashMap();
        
        for(int num: nums) {
            resultMap.put(num, resultMap.getOrDefault(num,0)+1);
        }
        return resultMap.entrySet().stream()
        .sorted((a,b)->b.getValue()-a.getValue())
        .limit(k)
        .mapToInt(a->a.getKey())
        .toArray();
        }
}
