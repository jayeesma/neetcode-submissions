class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int j =i+1;
        int maxProfit = 0;

        while(j<prices.length) {
            if(prices[j]<prices[i]) {
                i=j;
                j++;
            } else {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
                j++;
            }
        }
        return maxProfit;
    }
}
