class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int m = grid.length; // no of rows
        int n = grid[0].length; // no of columns

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]<0) ans++;
            }
        }

        return ans;
    }
}
