class Solution {
    public int maxArea(int[] height) {
        // int ans  = 0;
        // for(int i=0; i<height.length-1; i++){
        //     for(int j=i+1; j<height.length;j++){
        //         int h = Math.min(height[i],height[j]);
        //         int water = h*(j-i);
        //         ans = Math.max(water,ans);
        //     }
        // }

        int start = 0;
        int end = height.length-1;
        int ans = 0;

        while(start<end){
            int h = Math.min(height[start], height[end]);
            int water = h*(end-start);
            ans = Math.max(water,ans);

            if(height[start]<height[end]) start++;
            else end--; 
        }

        return ans;
    }
}
