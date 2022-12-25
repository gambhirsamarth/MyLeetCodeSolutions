// USING DUTCH NATIONAL FLAG ALGORITHM
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int lo = 0;
        int mid = 0;
        int hi = nums.size()-1;

        while(mid<=hi){
            switch(nums[mid]){

                case 0: // If value at mid = 0, swap with low and increment both by 1
                    swap(nums[lo++],nums[mid++]);
                    break;
                
                case 1: // If value at mid =1, continue and increment mid by 1
                    mid++;
                    break;

                case 2: // If value at mid = 2, swap with high and decrement high by 1
                    swap(nums[mid],nums[hi--]);
                    break;

            }
        }
    }
};
