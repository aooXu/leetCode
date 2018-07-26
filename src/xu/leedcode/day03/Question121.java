package xu.leedcode.day03;

import java.util.HashMap;

public class Question121 {

    public int maxProfit(int[] prices) {
        int maxProfit = -1;
        int size = prices.length;
        if(size==0) return 0;
        int lowestValue = prices[0];
        for(int i=1; i<size; i++){
            if(prices[i]<lowestValue) lowestValue = prices[i];
            if(prices[i]-lowestValue>maxProfit) maxProfit = prices[i]-lowestValue;
        }
        return maxProfit;
    }
}