class Solution {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] < nums[i + 1]) {
                sum += nums[i];
            } else {
                sum += nums[i];
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
        }
        return maxSum;
    }
}
