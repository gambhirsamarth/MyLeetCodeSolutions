class Solution {
    public String longestCommonPrefix(String[] S) {

        // Check if the input string array is null or empty
        if (S == null || S.length == 0) return "";
        
        // Loop through the characters of the first string in the array
        for (int i = 0; i < S[0].length() ; i++){
            // Get the character at the current index of the first string
            char c = S[0].charAt(i);
            
            // Loop through the other strings in the array
            for (int j = 1; j < S.length; j ++) {
                // If the current index is greater than or equal to the length of the current string
                // OR the character at the current index of the current string is not equal to the character
                // at the same index of the first string
                if (i == S[j].length() || S[j].charAt(i) != c)
                    // Return the substring of the first string up to the current index (excluding the current index)
                    return S[0].substring(0, i);             
            }
        }
        // If the loop completes without returning, the first string is the longest common prefix
        return S[0];
    }
}
