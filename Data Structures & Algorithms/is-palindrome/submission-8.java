class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0;
        int j= s.length()-1;

        while(i<j) {
            while(i<j && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while(i<j && !isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
            
        }

        return true;

    }
    public boolean isAlphanumeric(char c) {
        if((c>='A' && c<='Z') || 
            (c>='a' && c<= 'z') ||
            (c>='0' && c<='9')){
                return true;
            }
        return false;    
    }
}


//ignore case
// ignore space or other non alphanumeric character
// i=0 j =length-1
// while(i<j)
//  while(i<j && !isAlphanumeric(s.i))
//      i++ 
// while(i<j && !isAlphanumeric(s.j))
//      j--;

// if(s.i!=s.j) return false



// Was%%!saw