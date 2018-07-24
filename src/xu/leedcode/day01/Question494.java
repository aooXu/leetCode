package xu.leedcode.day01;
import java.util.Arrays;

public class Question494 {

    public int findTargetSumWays(int[] nums, int S) {
        return findCount(nums, S);
    }

    private int findCount(int[] numArray, int targetSum){
        int firstNum = numArray[0];
        int arrSize = numArray.length;
        if(arrSize==1){
            System.out.println(firstNum+","+targetSum);
            return (firstNum == Math.abs(targetSum)) ? (firstNum==0)? 2 : 1 : 0;
        }

        int[] tmpArray = Arrays.copyOfRange(numArray, 1,arrSize);
        return findCount(tmpArray, targetSum-firstNum)
                + findCount(tmpArray, targetSum+firstNum);
    }
}
