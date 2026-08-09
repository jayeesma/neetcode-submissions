class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }


        return map.entrySet().stream()
        .sorted(Comparator.<Map.Entry<Integer,Integer>>comparingInt(entry->entry.getValue()).reversed())
        .limit(k)
        .mapToInt(entry->entry.getKey())
        .toArray();
    }
}


