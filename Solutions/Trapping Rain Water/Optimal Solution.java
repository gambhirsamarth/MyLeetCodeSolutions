class Solution {
    public int trap(int[] height) {

        // Step 1 -> Initialize Variables
        int left=0;
        int right = height.length -1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;

        // Step 2 -> Traverse Array
        while(left<=right){
            
            // Step 3 -> update max variables and add to answer
            if(height[left]<=height[right]){
                if(leftMax<=height[left]){
                    leftMax = height[left];
                }
                else{
                    ans+= leftMax - height[left];
                }
                left++;
            }

            else{
                if(rightMax<=height[right]){
                    rightMax = height[right];
                }
                else{
                    ans += rightMax - height[right];
                }
                right--;
            }

        }

        return ans;
    }
}
