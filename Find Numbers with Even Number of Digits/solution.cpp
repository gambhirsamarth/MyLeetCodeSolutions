class Solution {
public:
    int findNumbers(vector<int>& nums) {
        
        int c=0;
        
        for(int i=0; i<nums.size(); i++){
            
            if(nums[i]>9 && nums[i]<100) c++;
            
            else if(nums[i]>999 && nums[i]<10000) c++;
            
            else if(nums[i]==100000) c++;
        }
        
        return c;
        
    }
};
