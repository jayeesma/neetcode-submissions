class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);

            map.putIfAbsent(sortedS, new ArrayList());
            map.get(sortedS).add(s);
        }

        return map.values().stream().collect(Collectors.toList());
    }
}
