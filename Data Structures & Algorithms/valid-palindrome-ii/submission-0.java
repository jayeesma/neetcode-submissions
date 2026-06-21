class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);


        if(isPallindrome(s)) {
            return true;
        }

        for(int i= 0 ; i<s.length(); i++) {
            String newString = s.substring(0,i)+s.substring(i+1);
            
            if(isPallindrome(newString)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPallindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.toString().equals(sb.reverse().toString());
    }


}