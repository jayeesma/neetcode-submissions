class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort the intervals
        // Create a new list which will have the new intervals -> res
        // Add the first interval in the list
        // Start iterating each interval from 2nd interval
        // if start of the 2nd interval is smaller or equal to res end?
        // - update the res end -> max of res end, currentEnd
        // else
        // - add new interval to the res
        //  convert res to list and return
        
        
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for(int[] interval: intervals) {
            int currentStart = interval[0];
            int currentEnd = interval[1];

            int lastEnd = res.get(res.size()-1)[1];

            if(currentStart<=lastEnd) {
                res.get(res.size()-1)[1] = Math.max(lastEnd,currentEnd);
            } else {
                res.add(new int[]{currentStart,currentEnd});
            }

        }
        return res.toArray(new int[res.size()][]);


        
    }
}


