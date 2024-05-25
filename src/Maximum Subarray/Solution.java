/*
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY : O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0; // initialise sum as 0
        int max = nums[0]; // initialise a max value as starting element

        for(int i=0; i<nums.length; i++){
            sum+=nums[i]; // keepm summing up all the elements
            if(sum>max)max=sum; // if sum > max, update max
            if(sum<0) sum =0; // if sum<0, we leave that part of array and start from sum=0
        }

        return max; // return max
    }
}
