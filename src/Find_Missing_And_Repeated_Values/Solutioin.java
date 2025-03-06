class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int[] freq = new int[(grid.length * grid.length) + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                freq[grid[i][j]]++;
                if (freq[grid[i][j]] == 2) {
                    result[0] = grid[i][j];
                }
            }
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}