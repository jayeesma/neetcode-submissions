class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int max = 0;
        int i=0;
        for(int j=0; j<s.length();j++) {
            char c = s.charAt(j);
            while(i<j && set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            } 
            set.add(c); 
            max = Math.max(j-i+1,max);
                       
        }
        return max;
    }
}

// p w w k e w

// i=0 j=0 => {p} max = 1
// i=0 j=1 -> {pw} max = 2
// i=2 j=2 => {w} window = 1 max = 2

// i=2, j=3 => {wk} window = 2
// i=2, j=4 => {wke} window = 3
// i=3, j=5 => {kew} window = 3