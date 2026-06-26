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
        if(intervals.size()<=1) return intervals.size() ;
        intervals.sort(Comparator.comparingInt(interval-> interval.start));

        Interval last = intervals.get(0);
        PriorityQueue<Integer> heap = new PriorityQueue();
        heap.offer(last.end);
        int room=1;

        for(int i=1;i<intervals.size(); i++) {
            if(heap.peek()<=intervals.get(i).start) {
                heap.poll();
            } else {
                room++;
            }
            heap.offer(intervals.get(i).end);
        }
        return room;


    }
}
