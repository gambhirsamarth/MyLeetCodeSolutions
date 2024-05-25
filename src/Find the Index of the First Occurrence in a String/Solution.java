class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        int start = 0;
        int end = needle.length() - 1;

        while (end < haystack.length()) {
            String subString;
            if (end == haystack.length() - 1) {
                subString = haystack.substring(start);
            } else {
                subString = haystack.substring(start, end + 1);
            }
            if (needle.equals(subString)) return start;
            else {
                start++;
                end++;
            }
        }
        return -1;
    }
}