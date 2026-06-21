class Solution {
    public boolean isPalindrome(String s) {

        if(s.isBlank()) {
            return true;
        }
        int i= 0;
        int j= s.length()-1;

        while(j>i) {
            while(i<j && !(isAlpha(s.charAt(i)))){
                i++;
            }
            while(i<j && !(isAlpha(s.charAt(j)))){
                j--;
            }
            if(s.toLowerCase().charAt(i)==s.toLowerCase().charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isAlpha(char c) {
        if((c>='A'&& c<='Z')
        || (c>='a'&& c<='z')
        || (c>='0'&& c<='9')) {
            return true;
        }
         return false;
    }
}
