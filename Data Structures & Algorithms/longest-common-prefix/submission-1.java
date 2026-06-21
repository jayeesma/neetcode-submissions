class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int j =1; j<strs.length; j++) {
            prefix = findPrefix(prefix, strs[j]);
        }
        return prefix;
    }

    private String findPrefix(String s1, String s2) {
        int length = Math.min(s1.length(),s2.length()); 
        int i = 0;
        while (i<length) {
            if(s1.charAt(i)==s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return s1.substring(0,i);
    }
}