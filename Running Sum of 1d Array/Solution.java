class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
