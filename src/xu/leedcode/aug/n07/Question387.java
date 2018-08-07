package xu.leedcode.aug.n07;

import java.util.LinkedList;
import java.util.List;

public class Question387 {

    public String getPermutation(int n, int k) {

        StringBuilder seq = new StringBuilder();
        List<Integer> list = new LinkedList<Integer>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
            count = count * (i + 1);
        }
        k--;
        for (int i = 0; i < n; i++) {
            count = count / (n - i);
            int index = k / count;
            seq.append(list.get(index));
            list.remove(index);
            k = k % count;

        }
        return seq.toString();

    }

}
