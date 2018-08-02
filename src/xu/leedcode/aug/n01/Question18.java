package xu.leedcode.aug.n01;

import java.util.ArrayList;
import java.util.List;

public class Question18 {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> tmpNumArray = new ArrayList<Integer>();


    public List<List<Integer>> fourSum(int[] nums, int target) {
        getNumbers(intArrToIntList(nums), target, 4);
        return result;
    }

    private List<Integer> intArrToIntList(int[] nums){
        ArrayList<Integer> tmpArr = new ArrayList<Integer>();
        for(int eachNum:nums) tmpArr.add(eachNum);
        return tmpArr;
    }

    private void getNumbers(List<Integer> nums, int target, int lest) {
        if(lest == 1){
            for(int eachNum: nums){
                if(eachNum == target){
                    addToTmpNumArray(5-lest, eachNum);
                    result.add(new ArrayList<Integer>(tmpNumArray));
                }
            }
        }else {
            if(nums.size() == 0) return;
            int numsSize = nums.size();
            List<Integer> subList = (List<Integer>) nums.subList(0, numsSize-1);
            getNumbers(subList, target, 4);
            getNumbers(subList, target-nums.get(numsSize-1), 3);
        }
    }

    private void addToTmpNumArray(int index, int num){
        if(tmpNumArray.size()<index){
            tmpNumArray.add(num);
        }else{
            tmpNumArray.set(index,num);
        }
    }
}