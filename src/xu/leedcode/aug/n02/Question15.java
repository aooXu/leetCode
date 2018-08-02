package xu.leedcode.aug.n02;

import java.util.ArrayList;
import java.util.List;

public class Question15 {
    class Solution {
        int[] nums;
        int[] tmpArr = new int[3];
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        public List<List<Integer>> threeSum(int[] nums) {
            this.nums= nums;
            getThreeSum(0, nums.length, 0);
            return results;
        }

        private void getThreeSum(int tmpArrLen, int lestArrLen, int targetNum){
            if(tmpArrLen+lestArrLen == 3|| tmpArrLen == 3){
                for(int i=lestArrLen-1; i<lestArrLen-4; i--){
                    tmpArr[tmpArrLen++] = nums[i];
                }
                if(tmpArr[0]+tmpArr[1]+tmpArr[2]==0){
                    results.add(intsToIntList());
                }
                return;

            }

            getThreeSum(tmpArrLen, lestArrLen-1, targetNum);
            getThreeSum(tmpArrLen+1, lestArrLen-1, targetNum-nums[lestArrLen-1]);
        }

        private List<Integer> intsToIntList(){
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            for(int eachNum: tmpArr) tmpList.add(eachNum);
            return tmpList;
        }
    }
}
