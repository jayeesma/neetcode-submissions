class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost=0;
        int totalGas =0;
        int total = 0;
        int res = 0;

        for(int i=0;i<gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalCost > totalGas) return -1;

        for(int i=0;i<gas.length;i++) {
            total += gas[i] - cost[i];

            if(total<0) {
                total = 0;
                res = i+1;
            }
            
        }
        return res;
    }
}



// gas[i]-cost[i]

// 3->0
// 4-1+1 = 4

// 0->1
// 4-2+2 = 4

// 1->2
// 4-2+3 = 5

// 2->3
// 4-4+1 = 1

// if gas[i]<cost[i] i++

