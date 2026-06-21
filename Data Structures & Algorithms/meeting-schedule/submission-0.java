/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));
        for(int i = 1 ; i< intervals.size(); i++) {
            Interval interval2 = intervals.get(i);
            Interval interval1 = intervals.get(i-1);
            if(interval1.end > interval2.start){
                return false;
            }
        }
        return true;

    }
}


// Implementation:

// 1. sort the intervals 
//      - intervals[i].start<=interval[i+1].start ?


// 2. intervals[i+1].start < intervals[i].end ? return false

// 5,40 -
// 0,30 - 

// 40, 30 - 30
// 0,5 - 5



// Requirments:
// Given interval

// intervals should not overlap -> if overlaps -> return false
 //                                   else      -> return true



 // [(5,10), (10,12)] -> true

 // [(5,10), (11,12)] -> false