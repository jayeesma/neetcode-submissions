class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int maxCount = 0;
        int maxWindow = 0;

        for(int j=0;j<s.length();j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            maxCount = Math.max(maxCount, map.get(s.charAt(j)));

            if((j-i+1) - maxCount <= k) {
                maxWindow = Math.max(maxWindow,j-i+1);
            } else if((j-i+1) - maxCount > k) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
        }
        return maxWindow;
    }
}

