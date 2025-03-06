class Solution {
    public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
        	return true;
        }

        int start = 0;
        int last = s.length() - 1;

        while(start <= last) {

        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);

            // if character is not alpganumeric, skip
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;

        	} 
            // if character is not alpganumeric, skip
            else if(!Character.isLetterOrDigit(currLast)) {
        		last--;

        	} 
            
            else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}

        		start++;
        		last--;
        	}
        }
        return true;
    }
}
