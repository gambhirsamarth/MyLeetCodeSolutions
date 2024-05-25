class Solution {
    public String largestOddNumber(String s) {
        // Loop through the string backwards, starting from the end
        for (int i = s.length() - 1; i >= 0; i--){
 
            // Check if the current character is odd
            if (s.charAt(i) % 2 != 0){
 
                // If it is, return the substring that contains
                // all the characters up to and including the current character
                String s1 = s.substring(0, i + 1);
                return s1;
            }
        }
        // If no odd number is found in the string, return an empty string
        return "";
    }
}
