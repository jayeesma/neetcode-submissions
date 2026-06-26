class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        List<int[]> merged = new ArrayList();

        merged.add(intervals[0]);


        for(int i=0;i<intervals.length;i++) {
            int[] last = merged.get(merged.size()-1);
            if(intervals[i][0]<= last[1]) {
                last[1] = Math.max(last[1],intervals[i][1]);
            } else {
                merged.add(intervals[i]);
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
