class Solution {
public:
    vector<int> leftRigthDifference(vector<int>& nums) {
        int n = nums.size();
        
        vector<int> ans;
        vector<int> leftSum(n,0) , rightSum(n,0);
        
        // calculate prefix sum of array
        for(int i=1; i<n; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        
        // calculate suffix sum of array
        for(int i=n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        
        for(int k=0 ; k<n; k++){
            if(leftSum[k]>rightSum[k]){
                ans.push_back(leftSum[k]-rightSum[k]);
            }
            
            else{
                ans.push_back(rightSum[k]-leftSum[k]);
            }
        }
        
        return ans;
    }
};
