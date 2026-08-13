class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j = strs[0].length();
        String prefix = strs[0];
       for(int i=0;i<strs.length-1;i++) {
            prefix = getPrefix(prefix,strs[i+1]);
       }
       return prefix;
    }

    private String getPrefix(String l, String r) {
        StringBuilder prefix = new StringBuilder();
        int length=0;
        if(l.length()<r.length()) {
            length = l.length();
        } else {
            length = r.length();
        }
        System.out.println("length:::"+ length);
        for(int i=0; i<length;i++) {
            if(l.charAt(i)==r.charAt(i)) {
                prefix.append(l.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}

// bat-> bag -

// b -> 3
// a -> 3
// t-> 1



