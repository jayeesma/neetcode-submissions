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
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) return 0;
        intervals.sort((a,b)->a.start - b.start);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(intervals.get(0).end);
        int count = 1;

        for(int i =1;i<intervals.size();i++) {
            if(queue.peek()>intervals.get(i).start) {
                count++;
            } else {
                queue.poll();
            }
            queue.offer(intervals.get(i).end);
        }
        return count;
    }
}
