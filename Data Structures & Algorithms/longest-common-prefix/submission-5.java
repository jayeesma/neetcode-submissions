class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++) {
            prefix = getPrefix(prefix,strs[i]);
        }

        return prefix;
        
    }
    private String getPrefix(String s1, String s2) {
        int len = 0;
        StringBuilder prefix = new StringBuilder("");
        if(s1.length()<s2.length()) {
            len = s1.length();
        } else {
            len = s2.length();
        }
        for(int i=0;i<len;i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            prefix.append(s1.charAt(i));
        }

        return prefix.toString();
    }
}