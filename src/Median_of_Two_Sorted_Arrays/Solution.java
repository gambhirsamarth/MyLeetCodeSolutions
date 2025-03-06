class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double ans;
        int index = 0;

        int [] nums = new int [m+n];

        for(int i=0; i<n; i++){
            nums[index] = nums1[i];
            index++;
        }
        
        for(int i=0; i<m; i++){
            nums[index] = nums2[i];
            index++;
        }
        
        Arrays.sort(nums);

        int size = nums.length;

        if(size%2!=0){
            ans = nums[((size+1)/2)-1];
        }
        else{
            ans = (nums[(size/2)-1] + nums[(size/2)]);
            ans = ans /2;
        }

        return ans;
    }
}
