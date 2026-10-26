class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int i=0;
        

        Map<Character, Integer> freqMap = new HashMap<>();
        int maxCount=0;
        for(int j=0;j<s.length();j++) {
            
            freqMap.put(s.charAt(j),freqMap.getOrDefault(s.charAt(j),0)+1);
            maxCount = Math.max(freqMap.get(s.charAt(j)),maxCount);
            
            while((j-i+1) - maxCount >k) {
                freqMap.put(s.charAt(i),freqMap.get(s.charAt(i))-1);
                i++;
            }

            max = Math.max(max,j-i+1);
        }

        return max;


    }
}