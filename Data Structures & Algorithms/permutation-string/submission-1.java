class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Ar = new int[26];
        int[] s2Ar = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Ar[s1.charAt(i) - 'a']++;
            s2Ar[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Ar, s2Ar)) {
            return true;
        }

        int l = 0;
        int r = s1.length();
        while (r < s2.length()) {
            s2Ar[s2.charAt(r) - 'a']++;
            s2Ar[s2.charAt(l) - 'a']--;
            if (Arrays.equals(s1Ar, s2Ar)) {
                return true;
            }
            r++;
            l++;
        }
        return false;
    }
}
