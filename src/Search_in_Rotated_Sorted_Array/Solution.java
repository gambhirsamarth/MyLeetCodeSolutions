class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
        int mid= (low + high) /2;
        if(nums[mid]==target) return mid;
        //check if left half is sorted
        if(nums[low]<=nums[mid]){
            //check if target lies on the left half
            if(target<=nums[mid] && target>=nums[low]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        //check if right half is sorted
        else{
            if(target>=nums[mid] && target<=nums[high]){  
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        }
        return -1;
    }
}
