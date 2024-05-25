class Solution {
    public int lengthOfLongestSubstring(String s) {
        // create a HashMap to store the characters and their last seen index in the string
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();

        int left = 0, right = 0; // initialize left and right pointers to first character
        int n = s.length(); // get length of string
        int len = 0; // initialize length to 0

        while (right < n) { // loop until right pointer reaches end of string
            if (mpp.containsKey(s.charAt(right))) { // if current character is already seen
                // update left pointer to be the maximum of the current left pointer and the index of the previously seen character plus 1
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }

            // update the last seen index of the current character in the HashMap
            mpp.put(s.charAt(right), right);

            // update length to be the maximum of current length and the difference between right and left pointers plus 1
            len = Math.max(len, right - left + 1);

            // move right pointer to next character
            right++;
        }

        return len; // return length of longest substring
    }
}
