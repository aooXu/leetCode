package xu.leedcode.aug.n03;

import java.util.Arrays;

public class Question16 {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(closest - target);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int tmpDiff = Math.abs(sum - target);
                if (tmpDiff < diff) {
                    diff = tmpDiff;
                    closest = sum;
                }
                int ignored = (sum < target)? start++ : end--;
            }
        }
        return closest;
    }
}
