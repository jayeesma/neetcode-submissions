class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buy = 0;

        for(int sell = 0;sell<prices.length;sell++) {
            if(prices[buy]>prices[sell]) {
                buy = sell;
            } else {
                profit = Math.max(profit, prices[sell]-prices[buy]);
            }
        }
        return profit;
    }
}



// [10,1,5,6,7,1]

// [10,1] = 1-10 = -6


// buy = 10
// sell = 10. // profit = 0

// buy = 10
// sell = 1.  // buy>sell

// buy =1
// sell = 5. // profit = 4

// buy = 1
//sell =6  // profit = 5

// buy =1
// sell = 7 // prifit =6

// buy =1
// sell =1 // profit = 0
