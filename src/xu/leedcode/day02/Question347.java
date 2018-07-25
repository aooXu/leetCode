package xu.leedcode.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question347 {

    private HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

    public List<Integer> topKFrequent(int[] nums, int k) {
        for (int eachNum : nums) {
            countMap.merge(eachNum, 1, (a, b) -> a + b);
        }

        List<Integer> sortedArr = mergeSort(new ArrayList<Integer>(countMap.keySet()));
        return sortedArr.subList(0, k);
    }

    private List<Integer> mergeSort(List<Integer> keyList) {
        int listSize = keyList.size();
        if (listSize <= 1) {
            return keyList;
        }

        List<Integer> first = keyList.subList(0, listSize / 2);
        List<Integer> second = keyList.subList(listSize / 2, listSize);

        first = mergeSort(first);
        second = mergeSort(second);

        return merge(first, second);
    }

    private List<Integer> merge(List<Integer> first, List<Integer> second) {
        int firstArrSize = first.size();
        int secondArrSize = second.size();
        List<Integer> tmpRst = new ArrayList<Integer>();
        int iFirst = 0, iSecond = 0;
        while (iFirst < firstArrSize && iSecond < secondArrSize) {
            Integer firstCount = countMap.get(first.get(iFirst));
            Integer secondCount = countMap.get(second.get(iSecond));
            tmpRst.add(
                    (firstCount >= secondCount) ? first.get(iFirst++) : second.get(iSecond++)
            );
        }
        ;
        tmpRst.addAll(
                (iFirst == firstArrSize) ? second.subList(iSecond, secondArrSize) : first.subList(iFirst, firstArrSize)
        );
        return tmpRst;
    }
}
