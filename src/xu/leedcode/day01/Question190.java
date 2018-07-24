package xu.leedcode.day01;

import java.util.ArrayList;
import java.util.List;

public class Question190 {
    public List<Integer> getRow(int rowIndex) {
        PasTriangle pasTriangle = new PasTriangle(rowIndex);
        return pasTriangle.getResult();
    }

    class PasTriangle {

        private List<Integer> result;
        private List<Integer> tmpArrayList;

        PasTriangle(int row) {
            int size = colAndRowToInt(row, row) + 1;
            this.tmpArrayList = new ArrayList<Integer>(size);
            for (int r = 0; r <= row; r++)
                for (int c = 0; c <= r; c++) {
                    calculateCell(r, c);
                }
            result = tmpArrayList.subList(colAndRowToInt(row, 0), size);
        }

        public List<Integer> getResult(){
            return result;
        }


        private void calculateCell(int row, int col){
            if(col == 0 || row == col) {
                tmpArrayList.add(1);
            } else {
                int leftTopValue = tmpArrayList.get(colAndRowToInt(row - 1, col - 1));
                int rightTopValue = tmpArrayList.get(colAndRowToInt(row-1, col));
                tmpArrayList.add(leftTopValue + rightTopValue);
            }
        }

        private int colAndRowToInt(int row, int col){
            return (1+row)*row/2+col;
        }

    }
}
