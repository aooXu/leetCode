package xu.leedcode.aug.n02;

public class Question01 {
    public int[] twoSum(int[] nums, int target) {
        int numArrLen = nums.length;
        for(int i=0; i<numArrLen; i++){
            int tmpTarget = target-nums[i];
            for (int j=0; j<numArrLen; j++){
                if(nums[j] == tmpTarget){
                    int[] results =  {i, j};
                    return results;
                }
            }
        }
        return null;
    }
    /*先用Quick Sort 找到所有在Target两边的值之后在用Binary Search 求解*/
}
