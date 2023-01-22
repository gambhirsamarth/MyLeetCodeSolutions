/*
  TIME COMPLEXITY: O(N)
  SPACE COMPLEXITY: O(N)

*/

class Solution {
public:
    bool isValid(string s) {
        
        stack<int> st;

        for(int i=0; i<s.size(); i++){

            // if it is an opening bracket, push into stack
            if( s[i]=='(' || s[i]=='[' || s[i]=='{') 
                st.push(s[i]);
            
            // else compare with givern conditions
            else{
                
                if(st.empty()) return false; // if stack is empty, not balanced

                char c = st.top();
                st.pop();

                if( s[i]==')' && c=='(' ||
                    s[i]==']' && c=='[' ||
                    s[i]=='}' && c=='{'
                )
                continue; // if they're equal, fine 

                else return false; // else not balanced

            }

        }

        // if stack is empty after whole traversal, it is balanced
        if(st.empty()) return true;

        // else return false
        return false;

    }
};
