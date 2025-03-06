/*
First we increment the first digit (last element) by 1, 
if it becomes 10 we make it 0 ans add 1 to the second digit.. 
until the last digit (first element), if it becoms 10 we make it 1 and push_back a leading zero.
*/

class Solution {
public:
    vector<int> plusOne(vector<int>& v) {
        int n = v.size();
        for(int i = n-1; i >= 0; i--){
            if(i == n-1)
                v[i]++;
            if(v[i] == 10){
                v[i] = 0;
                if(i != 0){
                    v[i-1]++;
                }
                else{
                    v.push_back(0);
                    v[i] = 1;
                }
            }
        }
        return v;
    }
};
