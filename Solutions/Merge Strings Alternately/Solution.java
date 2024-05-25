class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            result.append(i < word1.length() ? word1.charAt(i++) : "");
            result.append(j < word2.length() ? word2.charAt(j++) : "");
        }
        return result.toString();
    }
}