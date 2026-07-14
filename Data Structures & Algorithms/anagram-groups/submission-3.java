class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
            
            char[] c = strs[i].toCharArray();

            Arrays.sort(c);

            String sortedString = new String(c);

            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(strs[i]);

        }

        return map.values().stream().toList();
    }

}
