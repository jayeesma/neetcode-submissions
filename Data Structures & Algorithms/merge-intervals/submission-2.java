class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval-> interval[0]));
        List<int[]> mergedInterval = new ArrayList();
        int[] res = intervals[0];
        mergedInterval.add(res);
        
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= res[1]) {
                // overlap
                res[1] = Math.max(intervals[i][1], res[1]);
            } else {
                res = intervals[i];
                mergedInterval.add(res);
            }
            
        }
        return mergedInterval.toArray(new int[mergedInterval.size()][2]);
    }
}
