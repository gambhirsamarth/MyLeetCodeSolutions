class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, s=0, e=n-1;
        int [] ans = new int[n];
        int index = n-1;
        while(s<=e){
            if(Math.abs(nums[s])>=Math.abs(nums[e])){
                ans[index] = nums[s]*nums[s];
                index--;
                s++;
            }
            else{
                ans[index] = nums[e]*nums[e];
                index--;
                e--;
            }
        }

        return ans;
    }
}
