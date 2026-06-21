class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=l+1;
        int maxPrice = 0; 
        while(r<prices.length) {
            if(prices[l]<prices[r]) {
                int profit = prices[r] - prices[l];
                maxPrice = Math.max(maxPrice,profit);
            }
            else if(prices[l]>prices[r]) {
                l=r;
            
            }
            r++;
        }
        return maxPrice;
    }
}
