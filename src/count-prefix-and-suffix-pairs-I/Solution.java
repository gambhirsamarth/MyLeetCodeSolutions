class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j]))
                    count++;
            }
        }
        return count;
    }

    // public boolean isPrefixAndSuffix(String strOne, String strTwo) {
    //     if(strOne.length() > strTwo.length()) return false;
    //     String prefix = strTwo.substring(0, strOne.length());
    //     String suffix = strTwo.substring(strTwo.length() - strOne.length(), strTwo.length());
    //     return prefix.equals(strOne) && suffix.equals(strOne);
    // }

    public boolean isPrefixAndSuffix(String strOne, String strTwo) {
        if(strOne.length() > strTwo.length()) return false;
        return strTwo.startsWith(strOne) && strTwo.endsWith(strOne);
    }
}