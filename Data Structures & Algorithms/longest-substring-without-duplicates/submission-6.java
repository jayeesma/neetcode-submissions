class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int max = 0;
        for (int j = 0; j < s.length(); j++) {
            while(i<j && set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } 
            set.add(s.charAt(j));
            max = Math.max(j - i + 1, max);
            
        }
        return max;
    }
}
