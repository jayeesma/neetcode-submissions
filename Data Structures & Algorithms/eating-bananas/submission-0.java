class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();

        while(start<end) {
            int mid = start + (end - start)/2;
            if(timeTaken(mid,piles)>h) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int timeTaken(int minRate, int[] piles) {
        int timeTaken = 0;

        for(int i=0;i<piles.length;i++) {
            timeTaken+= (piles[i] + minRate -1 )/minRate;
        }

        return timeTaken;
    }
}

