import xu.leedcode.day02.Question347;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Question347 q = new Question347();
        int[] nums = {1,1,1,2,2,3};
        for(Integer eachStr:q.topKFrequent(nums,2)){
            System.out.println(eachStr);
        }
    }
}
