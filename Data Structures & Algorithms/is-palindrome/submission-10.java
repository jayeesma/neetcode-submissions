class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        if (c >= 'A' && c <= 'Z' || 
        c >= '0' && c <= '9' || 
        c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
}
