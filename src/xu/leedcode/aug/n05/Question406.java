package xu.leedcode.aug.n05;

import java.util.*;

public class Question406 {
    HashMap<Integer, ArrayList<Integer>> personMap = new HashMap<Integer, ArrayList<Integer>>();

    public int[][] reconstructQueue(int[][] people) {
        LinkedList<int[]> resultList = new LinkedList<int[]>();
        for (int[] eachPerson : people) {
            int height = eachPerson[0];
            int order = eachPerson[1];
            if (!personMap.containsKey(height)) {
                ArrayList<Integer> orderList = new ArrayList<Integer>();
                orderList.add(order);
                personMap.put(height, orderList);
            } else {
                personMap.get(height).add(order);
            }
        }

        int[] sortedKeySet = quickSortCollection(personMap.keySet());
        for(int i=sortedKeySet.length-1; i>=0; i++){
            int eachHeight = sortedKeySet[i];
            int[] sortedOrderList = quickSortCollection(personMap.get(eachHeight));
            for (int eachOrder:sortedOrderList) {
                int tmpOrder = eachOrder;
                for (int j=0;j<resultList.size();j++) {
                    if(tmpOrder==0) {
                        int[] tmpArr = {eachHeight,eachOrder};
                        resultList.add(j, tmpArr);
                        break;
                    }
                    int[] personInList = resultList.get(j);
                    if (personInList[0] >= eachHeight) tmpOrder--;
                }
            }
        }


        return intListToArr(resultList);
    }

    private int[][] intListToArr(List<int[]> integerList){
        int[][] result = new int[integerList.size()][2];

        return result;
    }

    private int[] quickSortCollection(Collection<Integer> collection){
        int[] result = new int[collection.size()];
        int i=0;
        for (int eachKey: collection) {
            result[i++] = eachKey;
        }
        quickSort(result, 0, result.length-1);
        return result;
    }

    private void quickSort(int array[], int left, int right) {
        if (left >= right)
            return;
        int i = left;
        int j = right;
        int key = array[left];
        while (i < j) {
            while (i < j && array[j] > key) j--;
            array[i] = array[j];
            while (i < j && array[i] < key) i++;
            array[j] = array[i];
        }
        array[i] = key;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
}
