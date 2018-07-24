package xu.leedcode.day01;

public class Question338 {
    public int[] countBits(int num) {
        int size = num + 1;
        int[] results = new int[size];
        for (int i = 0; i <= num; i++) {
            results[i] = countSingleNum(i);
        }
        return results;
    }

    private int countSingleNum(int num) {
        return Integer.bitCount(num);
    }
}
