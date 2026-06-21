class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r) {
            if(s.charAt(l) != s.charAt(r)) {
                // found mismatch
                return isPallindrome(s.substring(0,l) + s.substring(l+1)) ||
                 (isPallindrome(s.substring(0,r) + s.substring(r+1)));
            }
            l++;
            r--;
        

        }
        return true;

    }

    public boolean isPallindrome(String s) {
        int i =0;
        int j= s.length() -1;
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;;
        }
        return true;
    }
}