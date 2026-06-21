class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s1.toLowerCase();
        int i=0; 
        int j=s2.length()-1;

        while(i<j) {
            if(s2.charAt(i)!=s2.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
