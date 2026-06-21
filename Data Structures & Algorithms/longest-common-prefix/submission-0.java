class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i =1; i< strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
        }

        return prefix;

    }

    private String commonPrefix(String s1, String s2 ) {
        int length = Math.min(s1.length(), s2.length());
        int i =0;
        while(i<length) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                break;
            } else {
                i++;
            }
        }
        
        return s1.substring(0,i);
    }
}


// b -> 4
// a -> 4
// t -> 1
// g -> 1

// How would I get the string from the map




// bat.  bag

// if(s1.charAt(i) == s2.charAt(i))
//     i++

//     prefix = substring(0,i+1)