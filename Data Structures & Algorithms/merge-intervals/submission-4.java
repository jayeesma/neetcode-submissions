class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval-> interval[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        int n = merged.size();

        for(int i=1; i<intervals.length;i++) {
            
            int start = intervals[i][0];
            int end = intervals[i][1];
            int[] res = merged.getLast();

            if(start<=res[1]) {
                res[1] = Math.max(end, res[1]);
            } else {
                merged.add(new int[] {start,end});
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
