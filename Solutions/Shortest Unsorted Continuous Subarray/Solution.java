class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        // Initialize the variable end to -1 and the variable max to the first element of the array
        int end=-1;
        int max=nums[0];
        
        // Loop through the array, starting from the second element
        for(int i=1;i<nums.length;i++)
        {
            // If the current element is less than the maximum element seen so far, update the end variable to the current index
            if(max>nums[i])
            {
                end=i;
            }
            // Otherwise, update the maximum element seen so far to the current element
            else
            {
                max=nums[i];
            }
        } 
        
        // Initialize the variable start to 0 and the variable min to the last element of the array
        int start=0;
        int min=nums[nums.length-1];
        
        // Loop through the array backwards, starting from the second-to-last element
        for(int i=nums.length-2;i>=0;i--)
        {
            // If the current element is greater than the minimum element seen so far, update the start variable to the current index
            if(min<nums[i])
            {
                start=i;
            }
            // Otherwise, update the minimum element seen so far to the current element
            else
            {
                min=nums[i];
            }
        }
        
        // Return the length of the shortest subarray that needs to be sorted in non-decreasing order
        return end-start+1;
    }
}
