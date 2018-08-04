package xu.leedcode.July.n30;

public class Question300 {

    public int lengthOfLIS(int[] nums) {
        int results = 1;
        if (nums.length == 0) {
            return 0;
        }

        int[] f = new int[nums.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && f[j] + 1 > f[i]) {
                    f[i] = f[j] + 1;
                    if (f[i] > results) results = f[i];

                }
        }
        return results;
    }
}
