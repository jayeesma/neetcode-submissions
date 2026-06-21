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
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i=0; i<n;i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

          
        int count = 0;
        int s=0, e=0;
        int max = 0;

        while(s<n) {
            if(start[s]<end[e]){
                count++;
                s++;
            } else {
                count--;
                e++;
            }
            max= Math.max(max,count);
        }
        return max;
        
    }


    // [(1,3),(2,6),(5,8),(0,10),(7,12),(11,15),(13,18),(16,20),(19,25),(24,30)]

    // 1,3 -> (5,8) -> (11,15) -> (16,20) -> (24,30)

    // (2,6) -> (7,12)-> (13,18) -> (19,25)

    // (5,8) -> (11,15) -> (16,20)


    // 0,1,2,5,7,11,13,16,19.24
    // 3,6,8,10,12,15,18,20,25,30

    // s =0 e = 3
    // count = 1

    // s=1 e=3
    // count = 2

    // s=2 e = 3
    // count = 3

    // s = 5 e=3
    // count = 2

    // s = 5 e =6
    // count =3

    //s = 7 e = 6
    // count = 2

    // s= 7 e=8

    // count = 3

    // s= 11 e = 8 count = 2
    //s

}
