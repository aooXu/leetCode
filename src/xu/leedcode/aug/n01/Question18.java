package xu.leedcode.aug.n01;

import java.util.ArrayList;
import java.util.List;

public class Question18 {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> tmpNumArray = new ArrayList<Integer>();


    public List<List<Integer>> fourSum(int[] nums, int target) {

        return result;
    }


    private void getNumbers(int[] nums, int target, int lest) {
        if(lest == 1){
            for(int eachNum: nums){
                if(eachNum == target){
                    addToTmpNumArray(5-lest, eachNum);
                    result.add(new ArrayList<Integer>(tmpNumArray));
                }
            }
        }else {

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