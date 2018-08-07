package xu.leedcode.aug.n07;

public class Question134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int i = 0;
        int left = 0;
        int beg = 0;
        int total = 0;
        while (i < gas.length) {
            left += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (left < 0) {
                beg = i + 1;
                left = 0;
            }
            i++;
        }
        if (total >= 0) return beg;
        else return -1;
    }

}
