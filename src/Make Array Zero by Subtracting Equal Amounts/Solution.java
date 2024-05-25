class Solution {
    public int minimumOperations(int[] nums) {
        int [] temp = new int [101];
        int ans = 0;
        for(int i=0; i<nums.length; i++) temp[nums[i]] = 1;
        for(int i=1; i<101; i++) if(temp[i]==1) ans++;
        return ans;
    }
}


/*
In  each iteration,  we are making the smallest number as zero. So, to make the whole array zero, we will need to do number of operations equal to how many distinct numbers are there in the array. 

so, maintain a temp array of size 101 as all numbers are less than equal to 100. If i is present in the array, make its value 1.

Count the number of 1s at the end in temp array and it is the ans.


** A SET CAN ALSO BE  USED but we use array to keep space complexity constant.
*/
