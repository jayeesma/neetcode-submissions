class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int j = s1.length()-1;
        int i =0;
        while(j<s2.length()) {
            String window = s2.substring(i,j+1);
            if(isPermutation(s1, window)) {
                return true;
            }
            i++;
            j++;
        }
        return false;
        
    }

    private boolean isPermutation(String s1,String s2) {
        HashMap<Character, Integer> map = new HashMap();

        for(char c: s1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1); 
        }

        for(int i=0;i<s2.length();i++) {
            if(map.containsKey(s2.charAt(i))) {
                char c = s2.charAt(i);
                map.put(c, map.get(c)-1);
                if(map.get(c)<0) {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;
    }
}


// abc


// lecabee



// cba


