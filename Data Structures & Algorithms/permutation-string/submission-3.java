class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        int n = s1.length();
        for (int i = 0; i <= s2.length() - n; i++) {
            char[] subArr = s2.substring(i, i + n).toCharArray();
            Arrays.sort(subArr);

            if (Arrays.equals(s1Arr, subArr)) {
                return true;
            }
        }
        return false;
    }
}