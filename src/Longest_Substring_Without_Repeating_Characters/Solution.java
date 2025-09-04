import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> characterToLastIndexMap = new HashMap<>();

        while (left < s.length() && right < s.length()) {
            if(characterToLastIndexMap.containsKey(s.charAt(right)) && characterToLastIndexMap.get(s.charAt(right)) >= left){
                left = characterToLastIndexMap.get(s.charAt(right)) + 1;
            } else {
                maxLength = Math.max(maxLength, (right - left + 1));
            }
            characterToLastIndexMap.put(s.charAt(right), right);
            right++;
        }

        return maxLength;
    }
}