class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int max = 0;
        int start = 0;
        int end=0;
        while(end<s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;

            } else {
                max = Math.max(max, end - start +1);
                set.add(s.charAt(end));
                end++;
            }
            
        }
        return max;
    }



}


// s = "zxyzxyz"

// c = "z" set= {z}
 

// c = "x" set = {z,x}
// c = "y" set = {z,x,y} end =2 max = 3


