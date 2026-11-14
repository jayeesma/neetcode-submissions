class Solution {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return "";
        }
        int i = 0;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();
        int count = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                mapS.put(c, mapS.getOrDefault(c, 0) + 1);
                if (map.get(c).intValue() == mapS.get(c).intValue()) {
                    count++;
                }
            }
            while (count == map.size()) {
                if (j - i + 1 < min) {
                    min = j - i + 1;
                    start = i;
                }
                char ci = s.charAt(i);
                if (map.containsKey(ci)) {
                    if(map.get(ci).intValue()==mapS.get(ci).intValue()){
                        count--;
                    }
                    mapS.put(ci, mapS.get(ci) - 1);
                }
                i++;
            }
        }
        System.out.println(min);

        return (min == Integer.MAX_VALUE) ? "" : s.substring(start, start + min);
    }
}