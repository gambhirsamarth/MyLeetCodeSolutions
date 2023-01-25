class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i,j;
        int k=0, n=nums.size(); 
        
        while(k<n){
            if(nums[k]==0) break;
            else k++;
        }
        
        i=k, j=k+1;
        
        while(i<n && j<n){
            if(nums[j]!=0){
                swap(nums[i], nums[j]);
                i++;
            }
            
            j++;
        }
    }
};
