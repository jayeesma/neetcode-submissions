class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j= Arrays.stream(piles).max().getAsInt();
        while(i<j) {
            int mid = i+ (j-i)/2;
            if(timeTaken(mid,piles)>h) {
                i=mid+1;
            } else {
                j=mid;
            }
        }
        return j;
    }

    private int timeTaken(int rate, int[] piles) {
        int timeTaken = 0;
        for(int pile:piles) {
            timeTaken+=(pile+rate-1)/rate;
        }
        return timeTaken;
    }
}
