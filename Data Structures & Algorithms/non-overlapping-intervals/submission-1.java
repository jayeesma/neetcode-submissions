class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));

        List<int[]> current = new ArrayList();
        current.add(intervals[0]);
        int count = 0;

        for(int i = 1; i<intervals.length;i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int[] last = current.get(current.size()-1);
            
            

            if(start<last[1]) {
                count++;
            } else {
                current.add(new int[]{start,end});
            }
        }
        return count;
    }
}

// [1,2],[2,4],[1,4]

// [1,2], [2,4], [1,4]

// [1,2][1,4][2,4]

// [2,18], [4,6],[7,10]
