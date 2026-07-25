class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum()<Arrays.stream(cost).sum()) {
            return -1;
        }
        int res = 0;
        int balance = 0;
        for(int i=0;i<gas.length;i++) {
            balance += gas[i]-cost[i];

            if(balance<0) {
                balance = 0;
                res= i+1;
            }
        }
        return res;
    }
}
