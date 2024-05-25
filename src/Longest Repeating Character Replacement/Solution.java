public class Solution {
    public int characterReplacement(String s, int k) {
        // Create a hashmap to store the frequency count of each character
        HashMap<Character, Integer> hm = new HashMap<>();

        // Initialize variables to keep track of the longest substring and the left pointer
        int ans = 0;
        int l = 0;

        // Loop through the string with a sliding window
        for (int r = 0; r < s.length(); r++) {
            // Add the current character to the hashmap and update its frequency count
            hm.put(s.charAt(r), 1 + hm.getOrDefault(s.charAt(r), 0));

            // If the number of characters that need to be changed is greater than k, move the left pointer
            while ((r - l + 1) - Collections.max(hm.values()) > k) {
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l += 1;
            }

            // Update the length of the longest valid substring seen so far
            ans = Math.max(ans, r - l + 1);
        }

        // Return the length of the longest valid substring
        return ans;
    }
}
