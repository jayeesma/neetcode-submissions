class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap();
        int maxLength = 0;
        int maxFreq = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char cEnd = s.charAt(end);
            map.put(cEnd, map.getOrDefault(cEnd, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(cEnd));
            while ((end - start + 1) - maxFreq > k) {
                char c = s.charAt(start);
                map.put(c, map.get(c) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
