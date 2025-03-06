/*
Pop the elements out of stack if current bar's height is more than
the minimum height bar in stack and calculate the water stored in that area 
and add it to answer.
*/
class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int top = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty()) break; // Last bar as base cannot store any water.
                int width = i - stack.peek() - 1;
                int length = Math.min(height[i], height[stack.peek()]) - top;
                ans += length * width;
                
            }
            stack.push(i);
        }
        return ans;
    }
}
