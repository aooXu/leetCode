package xu.leedcode.aug.n03;

public class Question463 {

    public int islandPerimeter(int[][] grid) {
        int permeter = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++) for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    if(i==0 || grid[i-1][j] == 0
                    || i==n-1 || grid[i+1][j] == 0
                    || j==0 || grid[i][j-1] == 0
                    || j==m-1 || grid[i][j+1] == 0)
                        permeter++;
                }
        }
        return permeter;
    }

}
