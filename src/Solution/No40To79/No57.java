package Solution.No40To79;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Caily on 6/21/2017.
 */
public class No57 {


     // Definition for an interval.
      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        int start = newInterval.start, end = newInterval.end;
        List<Interval> list = new LinkedList<Interval>();

        boolean needAdd = false;

        for(Interval interval : intervals){

            if(interval.start <= start && interval.end >= start){
                start = interval.start;
                end = Math.max(end,interval.end);
            } else if(interval.start <= end && end <= interval.end){
                end = interval.end;
                start = Math.min(start, interval.start);
            } else list.add(interval);
        }

        list.add(new Interval(start,end));

        Collections.sort(list, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        return list;
    }
}
