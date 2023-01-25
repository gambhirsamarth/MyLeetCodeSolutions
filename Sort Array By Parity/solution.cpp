class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& arr) {
        
        
        int i,j,k=0; 
        int n = arr.size();
        
        while(k<n){
            
            if(arr[k]%2!=0) break;
            else k++;
            
        }
        
        i=k, j=k+1;
        
        while(i<n && j<n){
            if(arr[j]%2==0){
                swap(arr[i],arr[j]);
                i++;
            }
            
            j++;
        }
       
        return arr;
        
    }
};
