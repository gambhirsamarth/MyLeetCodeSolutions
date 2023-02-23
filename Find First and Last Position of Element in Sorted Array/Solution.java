class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};

        // first occurence
        int start= search(nums,target,true);
        
        // last occurence
        int end= search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    // this fucntion returns index value of target
    int search(int[] nums, int target, boolean findIndex){
        
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            // find middle element
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }

            else if(target>nums[mid]){
                start=mid+1;
            }

            else{
                ans = mid; // potential answer found

                // to search further on left side
                if(findIndex){
                    end=mid-1;
                }

                // to seatch further on right side
                else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
