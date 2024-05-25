class Solution {
    public int numIdenticalPairs(int[] nums) {

        int [] freq = new int[101]; // 101 because according to constraints,  
        // the element in array will not exceed 100.

        int n = nums.length, ans =0;

        for(int i=0; i<n; i++){
            freq[nums[i]]++;
        }

        for(int i=1; i< 101; i++){
            ans+= (freq[i] * (freq[i]-1))/2;
        }
        return ans;
    }
}
