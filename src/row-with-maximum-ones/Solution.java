class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] result = new int[2];
        int maxNumberOfOnes = 0;
        int rowWithMaxOnes = 0;
        for (int row = 0; row < mat.length; row++){
            int noOfOnesInCurrentRow =0;
            for(int col =0; col< mat[row].length; col++){
                if(mat[row][col] == 1){
                    noOfOnesInCurrentRow++;
                }
            }
            if(noOfOnesInCurrentRow > maxNumberOfOnes){
                maxNumberOfOnes = noOfOnesInCurrentRow;
                rowWithMaxOnes = row;
            }
        }
        result[0] = rowWithMaxOnes;
        result[1] = maxNumberOfOnes;
        return result;
    }
}