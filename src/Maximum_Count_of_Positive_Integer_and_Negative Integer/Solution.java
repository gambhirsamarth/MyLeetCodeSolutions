class Solution {
    public int maximumCount(int[] nums) {
        if ((nums[0] > 0 && nums[nums.length - 1] > 0) || (nums[0] < 0 && nums[nums.length - 1] < 0)) {
            return nums.length;
        }
        int pos = 0;
        int neg = 0;
        for (int num : nums) {
            neg += num < 0 ? 1 : 0;
            pos += num > 0 ? 1 : 0;
        }
        return Math.max(neg, pos);
    }

    // // [-3,-2,-1,0,0,1,2] 
    // public int maximumCount(int[] nums) {
    //     if ((nums[0] > 0 && nums[nums.length - 1] > 0) || (nums[0] < 0 && nums[nums.length - 1] < 0)) {
    //         return nums.length;
    //     }
    //     int start = 0;
    //     int end = nums.length - 1;


    // }

}