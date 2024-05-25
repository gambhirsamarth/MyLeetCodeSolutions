class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		/*STEPS FOR SOLUTION:-

		1) Starting from i=0 and j=col-1, navigate through matrix by comparing 
        target with matrix[i][j]

		2) If target>matrix[i][j]- move down i.e. i=i+1 and j remains same
		
        3) If target<matrix[i][j]- move left i.e. i remains same and j=j-1
        */
		int row= matrix.length;
		int col= matrix[0].length;

		int i=0, j=col-1;
		while(i<row && j>=0)
		{
			if(matrix[i][j]==target)
				return true;
			else if(matrix[i][j]<target)
				i++;
			else if(matrix[i][j]>target)
				j--;
		}
		return false;
	}
}
