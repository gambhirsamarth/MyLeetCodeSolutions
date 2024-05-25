class Solution {

    //sliding window
    public String minWindow(String s, String t) {
        // create a HashMap to store the frequency of characters in string 't'
        HashMap<Character, Integer> map = new HashMap<>();

        // iterate through the characters of 't' and update the count of characters in the HashMap
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // initialize variables to store the minimum window found so far
        int matched = 0; // number of characters in 's' that match the characters in 't'
        int start = 0; // starting index of the current window
        int minLen = s.length() + 1; // length of the minimum window found so far
        int subStr = 0; // starting index of the minimum window found so far

        // iterate through each character in 's'
        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            char right = s.charAt(endWindow);
            // check if the character is present in the HashMap
            if (map.containsKey(right)) {
                // decrement the count of the character in the HashMap
                map.put(right, map.get(right) - 1);
                // check if the count has become zero
                if (map.get(right) == 0) {
                    // if yes, increment the 'matched' variable
                    matched++;
                }
            }

            // check if all characters from 't' are present in the current window of 's'
            while (matched == map.size()) {
                // update 'minLen' and 'subStr' with the length and starting index of the minimum window found so far
                if (minLen > endWindow - start + 1) {
                    minLen = endWindow - start + 1;
                    subStr = start;
                }
                // slide the window to the right by incrementing the 'start' variable
                char deleted = s.charAt(start++);
                // check if the character removed is present in the HashMap
                if (map.containsKey(deleted)) {
                    // increment the count of the character in the HashMap
                    if (map.get(deleted) == 0) {
                        // if the count becomes zero, decrement the 'matched' variable
                        matched--;
                    }
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        // return the minimum window found in 's'
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}
