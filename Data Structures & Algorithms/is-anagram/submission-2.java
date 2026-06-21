class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char cs: s.toCharArray()) {
            map.put(cs, map.getOrDefault(cs,0)+1);
        }
        for(char ct: t.toCharArray()) {
            map.put(ct,map.getOrDefault(ct,0)-1);
            if(map.get(ct)<0) {
                return false;
            }
        }
        return true;
    }
}
