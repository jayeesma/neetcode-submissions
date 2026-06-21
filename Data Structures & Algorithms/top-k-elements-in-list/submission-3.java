class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        return map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .map(Map.Entry::getKey)
        .mapToInt(Integer::intValue)
        .toArray();

       

    }
}
