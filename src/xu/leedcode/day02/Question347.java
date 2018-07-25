package xu.leedcode.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Question347 {

    private HashMap<String, Integer> countMap = new HashMap<String, Integer>();

    public List<Integer> topKFrequent(int[] nums, int k) {
        ArrayList<Integer> tmpResults = new ArrayList<>();
        for (int eachNum : nums) {
            String eachKey = String.valueOf(eachNum);
            countMap.merge(eachKey, 1, (a, b) -> a + b);
        }

        String[] sortedArr = mergeSort(countMap.keySet());
        return tmpResults;
    }

    private List<String> mergeSort(List<String> keyList) {
        int listSize = keyList.size();
        if (listSize<= 1) {
            return keyList;
        }

        List<String> first = keyList.subList(0, listSize/2);
        List<String> second = keyList.subList(listSize/2, listSize);

        mergeSort(first);
        mergeSort(second);
        return merge(first, second);
    }

    private List<String> merge(List<String> first, List<String> second) {
        int firstArrSize = first.size();
        int secondArrSize = second.size();
        List<String> result = new ArrayList<String>(firstArrSize + secondArrSize);

        int iFirst = 0 , iSecond = 0, iMerged = 0;
        while (iFirst < firstArrSize&& iSecond < secondArrSize) {
            if (countMap.get(iFirst).compareTo(countMap.get(iSecond)) < 0) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }

        return result;
    }
}
