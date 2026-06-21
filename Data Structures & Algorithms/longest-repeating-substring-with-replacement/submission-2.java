class Solution {
    public int characterReplacement(String s, int k) {

        // if k + max_freq >= substring  => valid
        // if invalid , move the window

        int start = 0;
        Map<Character, Integer> charFreq = new HashMap<>(); 
        int max = 0;
        int max_freq = 0;
        for (int end = 0; end< s.length(); end++) {
            char charEnd = s.charAt(end);
            charFreq.put(charEnd, charFreq.getOrDefault(charEnd,0)+1);
            max_freq = Math.max(max_freq, charFreq.get(charEnd));

            while( (k + max_freq) < (end-start+1)) {
                char charStart = s.charAt(start);
                charFreq.put(charStart, charFreq.get(charStart)-1);
                start ++;
            }
            max = Math.max(max,end-start+1);
            

        }

        return max;

        

    }
}