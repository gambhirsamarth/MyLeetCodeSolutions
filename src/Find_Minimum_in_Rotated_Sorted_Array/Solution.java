class Solution {
    public int findMin(int[] nums) {

        if(nums[0]<nums[nums.length-1]) return nums[0]; // if array is not rotated
        if(nums.length==1) return nums[0]; // if only one element is present in the array

        int ans = Integer.MAX_VALUE;

        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid]>=nums[0]) start = mid+1;
            else {
                ans = Math.min(ans, nums[mid]);
                end = mid-1;
            }
            
        }

        return ans;
    }
}
