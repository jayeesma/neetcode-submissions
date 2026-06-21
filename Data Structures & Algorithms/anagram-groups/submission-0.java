class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        HashMap<String, ArrayList<String>> resMap = new HashMap();
        
        for (String s: strs) {
            int[] count = new int[26];
            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            String countStr = Arrays.toString(count);
            resMap.putIfAbsent(countStr, new ArrayList<String>());
            resMap.get(countStr).add(s);
            

        }
        return new ArrayList<>(resMap.values());
    }

}
