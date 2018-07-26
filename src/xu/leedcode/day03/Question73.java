package xu.leedcode.day03;

import java.util.HashMap;

public class Question73 {

    public void setZeroes(int[][] matrix) {
        if (matrix.length==0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<Integer, Integer> row = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> col = new HashMap<Integer, Integer>();

        for(int r=0; r<m; r++) for(int c=0; c<n; c++){
            if(matrix[r][c]==0){
                row.put(r, 1);
                col.put(c, 1);
            }
        }

        for(Integer eachRowIndex: row.keySet()){
            int[] eachRow = matrix[eachRowIndex];
            for(int i=0; i<n; i++) eachRow[i] = 0;
        }

        for(Integer eachColIndex: col.keySet()){
            for (int[] eachRow: matrix) {
                eachRow[eachColIndex] = 0;
            }
        }
    }
}

