class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) {
            return false;
        }

        int[] countS1 = new int[26];
        int[] countS2 = new int[26];


        for(char c: s1.toCharArray()) {
            countS1[c-'a']++;
        }

        int i =0;

        for(int j =0;j<s2.length();j++) {
            countS2[s2.charAt(j)-'a']++;

            if(j-i+1==s1.length()) {
                if(Arrays.toString(countS1)
                .equals(Arrays.toString(countS2))) {
                    return true;
                }

                countS2[s2.charAt(i)-'a']--;
                i++;
            }


        }
        return false;
    }
}