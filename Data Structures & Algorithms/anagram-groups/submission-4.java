class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char[] sortedSCh = s.toCharArray();
            Arrays.sort(sortedSCh);
            String sortedS = new String(sortedSCh);
            map.putIfAbsent(sortedS, new ArrayList());
            map.get(sortedS).add(s);

        }

        return map.values().stream().toList();
    }
}