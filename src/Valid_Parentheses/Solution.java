package Valid_Parentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                characters.add(s.charAt(i));
            } else{
                if(characters == null || characters.isEmpty()){
                    return false;
                }
                if((s.charAt(i) == ')' && characters.pop() == '(')
                || (s.charAt(i) == ']' && characters.pop() == '[')
                || (s.charAt(i) == '}' && characters.pop() == '{')){
                    continue;
                } else {
                    return false;
                }
            }
        }

         return characters.isEmpty();
    }
}