class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Object, List<String>> map = new HashMap();

        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            map.computeIfAbsent(sortedS, k->new ArrayList());
            map.get(sortedS).add(s);            
        }

        return map.values().stream().collect(Collectors.toList());
    }
}