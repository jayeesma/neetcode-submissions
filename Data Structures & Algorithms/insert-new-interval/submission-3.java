class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        while(i<n && intervals[i][1]<newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }

        while(i<n && newInterval[1]>=intervals[i][0]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        merged.add(newInterval);

        while(i<n) {
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][2]);
    }
}


// 





// [[1,3], [4,6]]

// [2,5]

// [1,5] , [4,6]

// [1,6]