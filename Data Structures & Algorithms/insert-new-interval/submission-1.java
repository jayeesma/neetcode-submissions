class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]> merged = new ArrayList<>();
        int i =0;
        int n = intervals.length;
        while (i<n && intervals[i][1]<newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;

        }
        merged.add(newInterval);
        while (i<n) {
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }

}


// intervals = [[0,2][1,3],[4,6]]

// [0,2]

// newInterval = [2,5]


// newInterval = [1,6]

// [0,2] [1,6]

// 1. Create a new Array 

// 1. append all the intervals where interval[i][1]< newInterval[0]


// 2. check for overlapping interval
// newInterval[0] = newIn