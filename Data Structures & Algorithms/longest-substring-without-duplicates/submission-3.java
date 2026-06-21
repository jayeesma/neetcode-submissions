class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sSet = new HashSet();

        int i=0;
        int max = 0;
        int j= 0;
        while(j<s.length()) {
            if(sSet.contains(s.charAt(j))) {
                sSet.remove(s.charAt(i));
                i++;
            } else {
                max = Math.max(max,j-i+1);
                sSet.add(s.charAt(j));
                j++;
            }

        }
        return max;
    }
}


