class Solution {
    public int maxProfit(int[] prices) {
        // take two pointers -> buy and sell
        // start with the first entry and traverse the array
        // if buy>sell => buy = prices[sell] sell++
        //    else sell++ 
        int sell =0;
        int buy =0;
        int profit = 0;
        int max = 0;
        while (sell<prices.length) {
            if(prices[sell]< prices[buy]) {
                buy = sell;
            } else {
                profit = prices[sell] - prices[buy];
                max = Math.max(max, profit);
            }
            sell ++;
        }
        return max;


    }
}
