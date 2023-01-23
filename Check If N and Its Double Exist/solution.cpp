class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
		
		//decalred a boolean variable ans and initialised it to false
        bool ans = false;
		
		//iterate over the vector and find two elements where either ,
		// (i) first = 2*second
		// (ii) first/2 = second
		
		/*** Don't forget to check that the one multiplied or divided with 2 , should be 
		a even number otherwise ( for 7,3  => 7/2 = 3 will return true)  ***/
		
        for(int i=0;i<arr.size();++i){		
            for(int j=0;j<arr.size();++j){
                if(i!=j && ((arr[i]%2==0 && arr[i]==2*arr[j]) || (arr[i]%2==0 && arr[i]/2==arr[j]))){
				
				//if found any such pair then assign true to the boolean variable ans and exit from the for loop
				//as there is no need to check further
				
                    ans = true;
                    break;
                }
            }
        }
         return ans;
    }
};
