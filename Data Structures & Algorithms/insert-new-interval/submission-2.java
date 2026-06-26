class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList();
        int n = intervals.length;
        int i=0;
        // intervals which are non overlapping and comes before new interval
        while(i<n && intervals[i][1]<newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        //check for overlapping
        while(i<n && newInterval[1]>=intervals[i][0]) {
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        merged.add(newInterval);
        //add the rest
        while(i<n) {
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][2]);
    }
}
