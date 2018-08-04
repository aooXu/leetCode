package xu.leedcode.aug.n03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question56 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size() == 0) {
            return result;
        }
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) {
                    return -1;
                } else if (o1.start > o2.start) {
                    return 1;
                }

                return 0;
            }
        });

        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            Interval previous = result.get(result.size() - 1);
            Interval temp = intervals.get(i);
            if (temp.start <= previous.end) {
                previous.end = temp.end > previous.end ? temp.end : previous.end;
            } else {
                result.add(temp);
            }
        }

        return result;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
